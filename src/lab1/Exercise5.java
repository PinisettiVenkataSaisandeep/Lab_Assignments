package lab1;

import java.util.Scanner;

public class Exercise5 {
	
	public static int calculateSum(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(i%3 ==0 || i%5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to calculate sum of numbers divisible by 3 and 5");
		int number = sc.nextInt();
		System.out.println(calculateSum(number));

	}

}
