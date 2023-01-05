package com.LockedMe;

import java.util.List;
import java.util.Scanner;



public class ControlMenuOption {
	public static void controlMainMenu() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuScreen.mainMenu();;
				int input = sc.nextInt();

				switch (input) {
				case 1:
					SortFiles.SortAllFiles("Main");
					break;
				case 2:
					ControlMenuOption.featuresMenuControl();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				controlMainMenu();
			} 
		} while (running == true);
	}
	
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
					// File Add
					System.out.println("Enter the name of the file to be added to the \"main\" folder");
					String fileToAdd = sc.next();
					
					AddUserFile.createFile(fileToAdd, sc);
					
					break;
				case 2:
					// File/Folder delete
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
						
						// If idx == 0, delete all files displayed for the name
						for (String path : filesToDelete) {
							DeleteFile.deleteFileFromFolder(path);
						}
					}
					

					break;
				case 3:
					// File/Folder Search
					System.out.println("Enter the name of the file to be searched from \"main\" folder");
					String fileName = sc.next();
					
					SortFiles.createMainFolder("main");
					SearchFile.displayFileLocations(fileName, "Main");

					
					break;
				case 4:
					// Go to Previous menu
					return;
				case 5:
					// Exit
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				featuresMenuControl();
			}
		} while (running == true);
	}
}
