package lab1;

import java.util.Scanner;

public class Exercise2 {
	
	public static String trafficLights(String color) {
		switch(color) {
		case "red":
			return "Stop";
		case "yellow":
			return "Ready";
		case "green":
			return "Go";	
		default:
			return "button not available";
		}	
	}
	
	public static void main(String[] args) {
		
		String button;
		System.out.println("Enter any button");
		Scanner sc=new Scanner(System.in);
		button = sc.next();
		System.out.println(button);
		System.out.println(trafficLights(button));
		
	}

}
