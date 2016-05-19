package br.edu.fjn.ws.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;

import br.edu.fjn.ws.connection.Connection;
import br.edu.fjn.ws.model.Evaluation;
import br.edu.fjn.ws.model.Internship;

public class EvaluationDAO {

	public void insert(Evaluation evaluation){
		EntityManager manager = Connection.getConnection();
		manager.getTransaction().begin();
		try {
			manager.persist(evaluation);
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
	
	@SuppressWarnings("unchecked")
	public static ArrayList<Evaluation> listAll() {

		Criteria criteria = Connection.getSession().createCriteria(Evaluation.class).addOrder(Order.asc("id"));

		return (ArrayList<Evaluation>) criteria.list();
	}
}
