package com.cap.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseUtil {
	private static EntityManagerFactory emfactory;
	static EntityManager entitymanager;

	public static EntityManager getConnetion() {
		  emfactory = Persistence.createEntityManagerFactory("EmployeeDatabaseJPA");
	      
	      entitymanager = emfactory.createEntityManager();
	      entitymanager.getTransaction().begin();
	      return entitymanager;
	}
	
	public static EntityManager createEManager() {
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "EmployeeDatabaseJPA" );
	      return entitymanager = emfactory.createEntityManager();
	}
	
	public static void closeConnections() {
		emfactory.close();
	}

}
