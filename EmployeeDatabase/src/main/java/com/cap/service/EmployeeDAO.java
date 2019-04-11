package com.cap.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cap.BO.Employee;

public class EmployeeDAO {
	private PreparedStatement ps = null;
	private Connection con; 
	
	@SuppressWarnings("unused")
	private DatabaseUtil databaseUtil;
	
	protected boolean saveEmployee(Employee emp) {
		String insert = "INSERT INTO EMPLOYEE (NAME, CITY, SALARY) VALUES(?,?,?)";
		con = DatabaseUtil.getConnection();
		try {
			ps = con.prepareStatement(insert);
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getCity());
			ps.setInt(3, emp.getSalary());
		
			int rows = ps.executeUpdate();
			
			if(rows>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DatabaseUtil.close();
		return false;
	}

	protected boolean updateEmployee(Employee emp, int empId) {
		String update = "UPDATE EMPLOYEE SET NAME = ?, CITY = ?, SALARY = ? WHERE EMPID = "+empId;
		new DatabaseUtil();
		con = DatabaseUtil.getConnection();
		try {
			ps = con.prepareStatement(update);
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getCity());
			ps.setInt(3, emp.getSalary());
			int rows = ps.executeUpdate();
			if(rows>0) {
				return true;
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		DatabaseUtil.close();
		return false;
	}

	protected boolean deleteEmployee(int empId) {
		if(findEmployee(empId) == null) 
			return false;
		String deleteQuery = "DELETE FROM EMPLOYEE WHERE EMPID = "+empId;
		new DatabaseUtil();
		con = DatabaseUtil.getConnection();
		try {
			ps = con.prepareStatement(deleteQuery);
			int i = ps.executeUpdate();
			if(i>0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DatabaseUtil.close();
		return false;
	}

	protected Employee findEmployee(int empId) {
		Employee emp = null;
		String findEmployee = "SELECT EMPID, NAME, CITY, SALARY FROM EMPLOYEE WHERE EMPID="+empId;
		new DatabaseUtil();
		con = DatabaseUtil.getConnection();
		try {
			Statement st = con.createStatement();
			if(st.execute(findEmployee)) {
				ResultSet rs = st.getResultSet();
				if(rs.next()) {
					emp = new Employee();
					emp.setEmpId(rs.getInt("EMPID"));
					emp.setName(rs.getString("NAME"));
					emp.setCity(rs.getString("CITY"));
					emp.setSalary(rs.getInt("SALARY"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DatabaseUtil.close();
		return emp;
	}

	protected List<Employee> findAll() {
		List<Employee> empList = new ArrayList<>();
		new DatabaseUtil();
		con = DatabaseUtil.getConnection();	
		String findAllEmp = "Select empid, name, city, salary from Employee";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(findAllEmp);
			while(rs.next()) {
				Employee emp = new Employee(rs.getInt("empid"), rs.getString("name"), rs.getString("city"), rs.getInt("salary"));
				empList.add(emp);
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		DatabaseUtil.close();
		return empList;
	}
}
