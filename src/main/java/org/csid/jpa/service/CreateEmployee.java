package org.csid.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.csid.jpa.entities.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Employee employee = new Employee();
		employee.seteId(1201);
		employee.setName("Gopal");
		employee.setSalary(40000);
		employee.setDeg("Technical Manager");
		entitymanager.persist(employee);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}

}
