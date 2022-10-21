package lab5;

import java.util.Scanner;

public class Exercise1 {
	
	

	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		try {
			checkAge(age);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
	}
	public static void checkAge(int n) {
		if(n<15) {
			throw new InvalidAgeException("Age should be greater than 15");
		}
	}

}
class InvalidAgeException extends RuntimeException{
	InvalidAgeException(String msg) {
		super(msg);
	}
}
