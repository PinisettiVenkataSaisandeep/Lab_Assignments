package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	
	public static String[] sortStrings(String[] str) {
		
		Arrays.sort(str);
		
		for(int i=0; i<=(str.length)/2; i++) {
			str[i] = str[i].toUpperCase();
		}
		
		for(int j=((str.length)/2)+1; j<str.length; j++) {
			str[j] = str[j].toLowerCase();
		}
		return str;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		String[] arr = new String[size];
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++) {
			arr[i] = sc.next();
		}
		String[] s = sortStrings(arr);
		for(String s1 : s) {
			System.out.println(s1);
		}

	}

}
