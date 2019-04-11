package com.cap.BO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEEJPA")
public class Employee {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="EMPID")
	private int empId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="SALARY")
	private int salary;
	
	public Employee() {
		super();
	}
	public Employee(String name, String city, int salary) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	public Employee(int empId, String name, String city, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee ID: " + empId + ", Name:" + name + ", City: " + city + ", Salary: " + salary;
	}
}