package com.cap.service;


import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

import org.hibernate.Criteria;

import com.cap.BO.Employee;


public class EmployeeDAO {
	Employee emp = null;
	
	protected boolean saveEmployee(String name, String city, int salary) {
		Session session = DatabaseUtil.getSessionFactory().openSession();
		
		Transaction txn = session.getTransaction();
		try {
			txn.begin();
			
			Employee employee = new Employee(name, city, salary);
			session.save(employee);
    		txn.commit();
		}	catch(Exception e) {
    			if(txn != null) { 
    				txn.rollback(); 
    				return false;
    			}
    			e.printStackTrace();
		}	finally {
				if(session != null) { session.close(); }
		}
		if(txn != null) {
			return true;
		}
		return false;
	}

	protected boolean updateEmployee(String name, String city, int salary, int empId) {
		Session session = DatabaseUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();
		try {
			txn.begin();
			emp = (Employee) session.get(Employee.class, empId);
			emp.setName(name);
			emp.setCity(city);
			emp.setSalary(salary);

    		txn.commit();
		}	catch(Exception e) {
    			if(txn != null) { 
    				txn.rollback(); 
    				return false;
    			}
    			e.printStackTrace();
		}	finally {
				if(session != null) { session.close(); }
		}
		if(txn != null) {
			return true;
		}
		return false;
	}

	protected boolean deleteEmployee(int empId) {
		Session session = DatabaseUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();
		try {
			txn.begin();
			emp = (Employee) session.get(Employee.class, empId);  
			session.delete(emp);
    		txn.commit();
		}	catch(Exception e) {
    			if(txn != null) { 
    				txn.rollback(); 
    				return false;
    			}
    			e.printStackTrace();
		}	finally {
				if(session != null) { session.close(); }
		}
		if(txn != null) {
			return true;
		}
		return false;
	}

	protected Employee findEmployee(int empId) {
		Session session = DatabaseUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();
		try {
			txn.begin();
			emp = (Employee)session.get(Employee.class, empId);
    		txn.commit();
		}	catch(Exception e) {
    			if(txn != null) { txn.rollback(); }
    			e.printStackTrace();
		}	finally {
				if(session != null) { session.close(); }
		}
		return emp;
	}

	@SuppressWarnings("unchecked")
	protected List<Employee> findAll() {
		Session session = DatabaseUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Employee.class);
		return criteria.list();
	}
}
