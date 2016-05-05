package br.edu.fjn.ws.dao;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import br.edu.fjn.ws.connection.Connection;
import br.edu.fjn.ws.model.User;

/*
 * 
 * @author Antonio Siqueira
 */

public class LoginDao {
	
	public boolean validateLogin(String name, String pass){
		EntityManager manager = Connection.getConnection();
		Session session = (Session) manager.getDelegate();
		Criteria criteria = session.createCriteria(User.class);
		
		Criterion c1 = Restrictions.ilike("userName", name);
		Criterion c2 = Restrictions.eq("userPassword", pass);
		
		criteria.add(Restrictions.and(c1,c2));
		
		return criteria.uniqueResult() != null;
	}
	
}