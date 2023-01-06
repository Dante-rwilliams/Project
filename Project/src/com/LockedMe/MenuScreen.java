package com.LockedMe;

public class MenuScreen {

	public static void mainMenu() {
		
		String m_Menu =
		"Please select one of the option number below by typing 1,2 or 3 then press Enter\n" +
		"1 - Display current files inside \"main\" folder \n" + 
		"2 - Menu for Additional Features\n" +
		"3 - Exit Application\n";
		System.out.println(m_Menu);
	}
	
	public static void featuresMenu() {
		String f_Menu = 
				"\n\n Select any option number from below by typing 1-5 and press Enter \n\n"+ 
				"1 - Add a file to \"main\" folder\n" +
				"2 - Delete a file from \"main\" folder\n" +
				"3 - Search for a file from \"main\" folder\n" + 
				"4 - Show Main Menu\n" + 
				"5 - Exit program\n";
 
		System.out.flush(); 
		System.out.println(f_Menu);
	}
}
