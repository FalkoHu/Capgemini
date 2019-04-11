package com.cap.main;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

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
				if(emp.saveEmployee(name, city, salary)) {
					System.out.println("You sucessfully added "+name);
				}else {
					System.out.println("Error");
				}
				break;
			case 2: 
				System.out.println("Enter employee ID");
				Employee employee = emp.findEmployee(scan.nextInt());
				System.out.println(employee.toString());
				break;
				
			case 3:
				List<Employee> list = emp.findAll();
				if(list.size()>0) {
					for(Employee e : list) {
						System.out.println(e.toString());
					}
				}else {
					System.out.println("No employees exists");
				}
				break;
			case 4:
				System.out.println("Enter employee ID");
				if(emp.deleteEmployee(scan.nextInt())) {
					System.out.println("You successfully deleted employee");
				}else {
					System.out.println("Error");
				}
				break;
			case 5: 
				System.out.println("Enter employee ID");
				int empId = scan.nextInt();
				System.out.println("Enter updated name");
				String updateName = scan.next();
				System.out.println("Enter updated city");
				String updateCity = scan.next();
				System.out.println("Enter updated salary");
				int updateSalary = scan.nextInt();
				if(emp.updateEmployee(updateName, updateCity, updateSalary, empId)) {
					System.out.println("You sucessfully updated "+updateName);
				}else {
					System.out.println("Error");
				}
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Invalid Input");
			}
		}	
	}
}