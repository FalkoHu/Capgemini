package com.cap.service;

import java.util.List;

import com.cap.BO.Employee;

public interface EmployeeService {	

	boolean saveEmployee(String name, String city, int salary);
	boolean updateEmployee(String name, String city, int salary, int empId);
	boolean deleteEmployee(int empId);
	Employee findEmployee(int empId);
	List<Employee> findAll();
}
