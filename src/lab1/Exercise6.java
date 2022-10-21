package lab1;

import java.util.Scanner;

public class Exercise6 {
	
	public static int calculateDifference(int n) {
		int diff = (n*(n+1)*(2*n+1)/6) - ((int)Math.pow(n*(n+1)/2, 2));
		return diff;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of integers to find difference");
		int number = sc.nextInt();
		System.out.println(calculateDifference(number));
	}

}
