package lab5;

import java.util.Scanner;

public class Exercise2 {

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
			checkName(firstName, lastName);
		} catch (InvalidNameException e) {
			e.printStackTrace();
		}
		
	}
	public static void checkName(String firstName, String lastName) {
		if(firstName.length()==0 || lastName.length()==0) {
			throw new InvalidNameException("First name and Last name should not be blank");
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
class InvalidNameException extends RuntimeException{
	InvalidNameException(String msg) {
		super(msg);
	}
}

