package com.cap.main;

import java.util.List;
import java.util.Scanner;

import com.cap.BO.Employee;
import com.cap.service.EmployeeServiceImpl;

public class Main {
	
	public static void main(String s[]) {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in).useDelimiter(System.lineSeparator());
		
		boolean showMenu = true;
		while(showMenu) {
			
			System.out.println("1. Add Employee \n"+
								"2. View Employee \n"+
								"3. View All Employees \n"+
								"4. Delete Employee \n"+
								"5. Update Employee \n"+
								"6. Exit");
			switch(scan.nextInt()){
			case 1: 
				System.out.println("Enter name");
				String name = scan.next();
				System.out.println("Enter city");
				String city = scan.next();
				System.out.println("Enter salary");
				int salary = scan.nextInt();
				if(emp.saveEmployee(new Employee(name, city, salary))) {
					System.out.println("You succesfully added new Employee");
				}else {
					System.out.println("Error");
				}
				break;
			case 2: 
				System.out.println("Enter employee ID");
				Employee employee = emp.findEmployee(scan.nextInt());
				if(employee != null) {
					System.out.println(employee.toString());
				}else {
					System.out.println("Error");
				}
				break;
			case 3: 
				List<Employee> list = emp.findAll();
				if(list.size() > 0) {
					for(Employee e : list) {
						System.out.println(e.toString());
					}
				}else {
					System.out.println("No Employees exists");
				}
				break;
			case 4: 
				System.out.println("Enter employee ID");
				if(emp.deleteEmployee(scan.nextInt())) {
					System.out.println("You sucessfully deleted Employee");
				}else {
					System.out.println("Error");
				}
				break;
			case 5:
				System.out.println("Enter employee ID you want to update");
				int employeeId = scan.nextInt();
				System.out.println("Enter name");
				String empName = scan.next();
				System.out.println("Enter city");
				String empCity = scan.next();
				System.out.println("Enter salary");
				int empSalary = scan.nextInt();
				if(emp.updateEmployee(new Employee(empName, empCity, empSalary), employeeId)) {
					System.out.println("You sucessfully updated Employee");
				}else {
					System.out.println("Error");
				}
				break;
			case 6: 
				System.exit(0);
			default: 
				System.out.println("Invalid input");
				
			}
		}
		
		
		
	}
	
}