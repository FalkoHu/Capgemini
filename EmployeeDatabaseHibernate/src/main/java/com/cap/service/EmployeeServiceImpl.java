package com.cap.service;

import java.util.List;

import com.cap.BO.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO empDao = new EmployeeDAO();
	
	public boolean saveEmployee(String name, String city, int salary) {
		return empDao.saveEmployee(name, city, salary);
	}

	public boolean updateEmployee(String name, String city, int salary, int empId) {
		return empDao.updateEmployee(name, city, salary, empId);
	}

	public boolean deleteEmployee(int empId) {
		return empDao.deleteEmployee(empId);
	}

	public Employee findEmployee(int empId) {
		return empDao.findEmployee(empId);
	}

	public List<Employee> findAll() {
		return empDao.findAll();
	}	
}
