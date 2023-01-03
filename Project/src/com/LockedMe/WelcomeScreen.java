package com.LockedMe;

import java.util.Scanner;

public class WelcomeScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner inputOpt = new Scanner(System.in);
		
		System.out.println("Main Screen \n\nComapany Lockers Application \nDeveloper Name: Dante Willims \n");
		
		/*
		 * while(inputOpt.hasNext()) {
		 * 
		 * String input = inputOpt.nextLine(); try { return; } catch(Exception e) {
		 * 
		 * System.out.println("Incorrect input, try again"); } }
		 */
		while (SelectedOpt != 3) {
		System.out.println("Please select one of the 3 options below by typing 1,2 or 3");
		
		
		System.out.println("1 - Display current files");
		System.out.println("2 - Additional Features");
		System.out.println("3 - Exit Application");
		
		System.out.println("\nOption: ");
		Integer SelectedOpt = inputOpt.nextInt();
		}
	}

}
