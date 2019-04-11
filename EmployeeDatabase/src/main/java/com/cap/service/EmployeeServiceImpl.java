package com.cap.service;

import java.util.List;

import com.cap.BO.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO empDao = new EmployeeDAO();
	
	public boolean saveEmployee(Employee employee) {
		return empDao.saveEmployee(employee);
	}

	public boolean updateEmployee(Employee emp, int empId) {
		return empDao.updateEmployee(emp, empId);
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
