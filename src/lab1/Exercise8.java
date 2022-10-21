package lab1;

import java.util.Scanner;

public class Exercise8 {

	public static boolean checkNumber(int n) {
		
		boolean a;
		
		while(n%2 == 0) {
			n /= 2;
		}
		
		a = (n == 1);
		return a;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is power of 2");
		int number = sc.nextInt();
		System.out.println(checkNumber(number));
		
	}

}
