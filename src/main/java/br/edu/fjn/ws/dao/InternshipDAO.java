package br.edu.fjn.ws.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.edu.fjn.ws.connection.Connection;
import br.edu.fjn.ws.model.Internship;
import br.edu.fjn.ws.model.Supervisor;

public class InternshipDAO {

	public void insert(Internship internship) {
		EntityManager manager = Connection.getConnection();
		manager.getTransaction().begin();
		try {
			manager.persist(internship);
			manager.getTransaction().commit();
		} catch (NullPointerException nullPointerException) {
			manager.getTransaction().rollback();
		} catch (Exception exception) {
			manager.getTransaction().rollback();
		} finally {
			manager.clear();
			manager.close();
		}
	}
	
	public List<Internship> searchInternshipBySuperv(Integer idSuperv) {
		EntityManager manager = Connection.getConnection();
		Session session = (Session) manager.getDelegate();

		Criteria CSuperv = session.createCriteria(Supervisor.class);
		Criterion c1 = Restrictions.eq("id", idSuperv);
		// Criterion c2 = Restrictions.eq("codigo", string);
		// Criterion c3 = Restrictions.or(c1, c2);
		CSuperv.add(c1);
		
		Criteria CIntern = session.createCriteria(Internship.class);
		Criterion c2 = Restrictions.eq("supervisor", CSuperv.uniqueResult());
		Criterion c3 = Restrictions.eq("status", "0");
		
		CIntern.add(c2);
		CIntern.add(c3);

		List<Internship> internship = CIntern.list();
		return internship;
	}
		
	@SuppressWarnings("unchecked")
	public static ArrayList<Internship> listStatusEvaluation(){
		Criteria criteria = Connection.getSession().createCriteria(Internship.class).addOrder(Order.asc("id"));
		Criterion criterion = Restrictions.eq("status", "1");
		criteria.add(criterion);
		return (ArrayList<Internship>) criteria.list();
	}
	
	
	@SuppressWarnings("unchecked")
	public static ArrayList<Internship> listAll() {
		Criteria criteria = Connection.getSession().createCriteria(Internship.class).addOrder(Order.asc("id"));
		return (ArrayList<Internship>) criteria.list();
	}
	
	
	public Internship searchId(int id){
		EntityManager manager = Connection.getConnection();
		Session session = (Session) manager.getDelegate();
		Criterion c1 = Restrictions.eq("id", id);
		Criteria criteria = session.createCriteria(Internship.class);
		criteria.add(c1);
		return (Internship) criteria.uniqueResult();
	}
	
	public void updateStatus(Internship internship) {
		EntityManager manager = Connection.getConnection();
		manager.getTransaction().begin();
		try {
			manager.merge(internship);
			manager.getTransaction().commit();
		} catch (NullPointerException e) {
			manager.getTransaction().rollback();
		} catch (Exception e) {
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
	}
}
