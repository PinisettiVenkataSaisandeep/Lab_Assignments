package com.cg.eis.exception;

import java.util.Scanner;

public class Lab5Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details");
		String firstName, lastName;
		int empId;
		double salary;
		firstName = sc.nextLine();
		lastName = sc.nextLine();
		empId = sc.nextInt();
		salary = sc.nextDouble();
		Employee emp1 = new Employee(firstName, lastName, empId, salary);
		try {
			checkSalary(salary);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
	}
	public static void checkSalary(double salary) {
		if(salary<3000) {
			throw new EmployeeException("Employee salary is below 3000");
		}
	}

}

class Employee {
	private String firstName, lastName;
	private int empId;
	private double salary;
	
	public Employee(String firstName, String lastName, int empId, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.salary = salary;
	}
	
}

class EmployeeException extends RuntimeException{
	EmployeeException(String msg) {
		super(msg);
	}
}

