package lab2;

import java.util.Scanner;

public class Exercise1 {

	public static int getSecondSmallest(int[] arr){
		int secondSmallest = arr[0];
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[j]<arr[i]) {
					secondSmallest = arr[j];
					arr[j] = arr[0];
					arr[0] = secondSmallest;
				}
			}
		}
		secondSmallest = arr[1];
		return secondSmallest;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getSecondSmallest(arr));
	}

}
