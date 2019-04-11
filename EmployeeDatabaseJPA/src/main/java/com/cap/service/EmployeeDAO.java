package com.cap.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cap.BO.Employee;

public class EmployeeDAO {
	private EntityManager entitymanager;
	private Employee employee;
	
	protected boolean saveEmployee(String name, String city, int salary) {
	     try { 
			  entitymanager = DatabaseUtil.getConnetion();
		      employee = new Employee(name, city, salary);
		      
		      entitymanager.persist(employee);
		      entitymanager.getTransaction().commit();
	     }catch(Exception e) {
	    	 System.out.println(e);
	    	 return false;
	     }finally {
	    	 DatabaseUtil.closeConnections();
	     }
	      return true;
	}

	protected boolean updateEmployee(String name, String city, int salary, int empId) {
			
		  try {
			  entitymanager = DatabaseUtil.getConnetion();
		      employee = entitymanager.find(Employee.class, (Integer)empId);
		      employee.setName(name);
		      employee.setCity(city);
		      employee.setSalary(salary);
		      entitymanager.getTransaction().commit();
		  }catch(Exception e) {
			  System.out.println(e);
			  return false;
		  }finally {
			  DatabaseUtil.closeConnections();
		  }
	      return true;
	}

	protected boolean deleteEmployee(int empId) {
		
			try {
			  entitymanager = DatabaseUtil.getConnetion();
		      employee = entitymanager.find( Employee.class, (Integer)empId);
		      entitymanager.remove(employee);
		      entitymanager.getTransaction().commit();
			}catch(Exception e) {
				System.out.println(e);
				return false;
			}finally {
				DatabaseUtil.closeConnections();
			}
	      return true;
	}

	protected Employee findEmployee(int empId) {
		entitymanager = DatabaseUtil.createEManager();
	    employee = entitymanager.find( Employee.class, (Integer)empId);
		return employee;
	}

	protected List<Employee> findAll() {
		entitymanager = DatabaseUtil.createEManager();
		TypedQuery<Employee> query = entitymanager.createQuery("SELECT e FROM Employee e", Employee.class);
	    return query.getResultList();
	}
}
