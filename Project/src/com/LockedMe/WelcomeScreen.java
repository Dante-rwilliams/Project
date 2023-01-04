package com.LockedMe;

public class WelcomeScreen {
	
	
	
	public static void printWelcomeScreen() {
		//Will show application details on console
		String appDetails = String.format(
				"\nWelcome to LockedMe.com \n" 
				+ "This application was developed by Dante Williams\n"
				+ "*****************************************************\n");
		System.out.println(appDetails);
		
		//Will show application features on console
		String appFunction = "Please see below a list of application features :-\n"
				+ " - You will be able to access all files in the \"main\" folder\n"
				+ " - Add, delete or search for specific files in \"main\" folder.\n"
				+ "\n**Please be careful to ensure the correct filename is provided for searching or deleting files.**\n";
		System.out.println(appFunction);
	}

}
