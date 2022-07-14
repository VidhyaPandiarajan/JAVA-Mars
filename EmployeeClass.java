package com.training.mars;
import java.util.Scanner;



public class EmployeeClass {

	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			
			System.out.println("Enter Employee Id:");
			int id = scanner.nextInt();
			e.setEmployeeId(id);
			
			System.out.println("Enter Employee Name:");
			String name = scanner.next();
			e.setEmployeeName(name);
			
			System.out.println("Enter Employee Department:");
			String department = scanner.next();
			e.setDepartment(department);
			
			System.out.println("Enter Employee Age:");
			int age = scanner.nextInt();
			e.setEmpAge(age);
			
			System.out.println(e.getEmployeeInfo());
			
		}
		
		

	}

}
