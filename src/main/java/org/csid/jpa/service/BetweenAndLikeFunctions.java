package org.csid.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.csid.jpa.entities.Employee;

public class BetweenAndLikeFunctions {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		Query query = entitymanager.createQuery( "Select e " +
				 "from Employee e " +
				 "where e.salary " +
				 "Between 30000 and 40000" );
		List<Employee> list = (List<Employee>)query.getResultList();
		
		for(Employee e:list) {
			System.out.println("Employee ID :"+e.geteId());
			System.out.println("\t Employee salar :"+e.getSalary());
			
		}
		
		Query query1 = entitymanager.createQuery("Select e " +
				 "from Employee e " +
				 "where e.ename LIKE 'M%'");
		List<Employee> list1 = (List<Employee>) query1.getResultList();
		
		for(Employee e:list1) {
			System.out.println("Employee ID :"+e.geteId());
			System.out.println("\t Employee name :"+e.getName());
		}
	}

}
