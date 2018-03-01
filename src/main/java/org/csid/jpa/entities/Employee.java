package org.csid.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQuery(
	query = "Select e from Employee e where e.eid = :id",
	name = "find employee by id")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eId;
	private String name;
	private int salary;
	private String deg;
	
	public Employee() {
		super();
	}

	public Employee(int eId, String name, int salary, String deg) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.deg = deg;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + ", deg=" + deg + "]";
	}
}
