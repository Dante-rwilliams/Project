package com.LockedMe;

import java.util.List;
import java.util.Scanner;



public class ControlMenuOption {
	public static void controlMainMenu() {
		boolean running = true; // Check if method is active
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuScreen.mainMenu();;
				int input = sc.nextInt();

				//Main menu option selection control
				switch (input) {
				case 1:
					SortFiles.SortAllFiles("Main");
					break;
				case 2:
					ControlMenuOption.featuresMenuControl();
					System.out.print("\033[H\033[2J"); 
					System.out.flush(); 
					// Clears the screen for features menu 
					break;
				case 3:
					System.out.println("You have exited the Application.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("\n****Invalid input, please enter numerical value 1-3.****\n");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				controlMainMenu();
			} 
		} while (running == true);
	}
	
	
	//Second Selection menu Control
	public static void featuresMenuControl() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuScreen.featuresMenu();
				SortFiles.createMainFolder("main");
				
				int input = sc.nextInt();
				switch (input) {
				
				case 1:
					// Function to add file to folder
					System.out.println("Enter the name of the file to be added to the \"main\" folder");
					String fileToAdd = sc.next();
					
					AddUserFile.createFile(fileToAdd, sc);
					
					break;
					
				case 2:
					// Function to delete file from folder
					System.out.println("Enter the name of the file to be deleted from \"main\" folder");
					String fileToDelete = sc.next();
					
					SortFiles.createMainFolder("Main");
					List<String> filesToDelete = SearchFile.displayFileLocations(fileToDelete, "main");
					
					String deletionPrompt = "\nSelect index of which file to delete?"
							+ "\n(Enter 0 if you want to delete all elements)";
					System.out.println(deletionPrompt);
				
					int idx = sc.nextInt();
					
					if (idx != 0) {
						DeleteFile.deleteFileFromFolder(filesToDelete.get(idx - 1));
					} else {
						
						// If delete all files displayed for the name
						for (String path : filesToDelete) {
							DeleteFile.deleteFileFromFolder(path);
						}
					}
					

					break;
					
				case 3:
					// Search "main" file or folder
					System.out.println("Enter the name of the file to be searched from \"main\" folder");
					String fileName = sc.next();
					
					SortFiles.createMainFolder("main");
					SearchFile.displayFileLocations(fileName, "Main");

					
					break;
					
				case 4:
					// Go to main menu
					return;
					
				case 5:
					// Exit program
					System.out.println("You have exited the Application.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("\n****Invalid input, please enter numerical value 1-5.****\n");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				featuresMenuControl();
			}
		} while (running == true);
	}
}
