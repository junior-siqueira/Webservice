package br.edu.fjn.ws.dao;

import javax.persistence.EntityManager;

import br.edu.fjn.ws.connection.Connection;
import br.edu.fjn.ws.model.User;

public class UserDAO {

	public void insert(User user) {

		EntityManager manager = Connection.getConnection();

		manager.getTransaction().begin();

		try {
			manager.persist(user);
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

}
