package com.cap.service;

import java.util.List;

import com.cap.BO.Employee;

public interface EmployeeService {	

	boolean saveEmployee(Employee employee);
	boolean updateEmployee(Employee emp, int empId);
	boolean deleteEmployee(int empId);
	Employee findEmployee(int empId);
	List<Employee> findAll();
}
