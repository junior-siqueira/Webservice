package br.edu.fjn.ws.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;

public class Connection {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("fjnestagios");

	private Connection() {

	}

	public static EntityManager getConnection() {
		return emf.createEntityManager();
	}

	public static Session getSession() {
		EntityManager manager = getConnection();
		return (Session) manager.getDelegate();
	}
	
	public static void close(){
		emf.close();
	}
}
