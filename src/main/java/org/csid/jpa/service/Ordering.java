package org.csid.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.csid.jpa.entities.Employee;

public class Ordering {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		Query query = entitymanager.
				createQuery( "Select e " +
				 "from Employee e " +
				 "ORDER BY e.ename ASC" );
		
		List<Employee> list=(List<Employee>)query.getResultList();
		
		for( Employee e:list ){
			System.out.print("Employee ID :"+e.geteId());
			System.out.println("\t Employee Name :"+e.getName());
		}

	}

}
