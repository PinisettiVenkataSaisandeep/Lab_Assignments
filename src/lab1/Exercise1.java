package lab1;

import java.util.Scanner;

public class Exercise1 {
	public static int sumOfCubes(int digit, int value) {
		int sum=0, rem;
		while(digit>0) {
			rem = value%10;
			sum += rem*rem*rem;
			value /= 10;
			digit--;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int digit,num;
		System.out.println("Enter number of digits");
		Scanner sc=new Scanner(System.in);
		digit=sc.nextInt();
		System.out.println("Enter number");
		num=sc.nextInt();
		System.out.println("The sum of cubes of digit is");
		System.out.println(sumOfCubes(digit,num));
	}

}
