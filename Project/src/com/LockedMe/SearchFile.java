package com.LockedMe;

import java.io.File;
import java.util.Scanner;

public class SearchFile {

	public static void main(String[] args) {

		//Location: Directory
		//Many files
		//one file
		
		SearchFile sf= new SearchFile();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the file to be searched: ");
		String name= sc.next();
		System.out.println("Enter the directory to search: ");
		String dir = sc.next();
		//directory or location is a part of the File library
		sf.findFile(name, new File(dir));
	}
	
	//is to find a file in a directory
	void findFile(String name, File file) {
		File[] list= file.listFiles();
		if( list != null) {
			
			
			for( File f1:list) {
				if(f1.isDirectory()) {
					findFile(name, f1);
					System.out.println("File not found");
				}else if(name.equalsIgnoreCase(f1.getName())) {
					System.out.println("File found");
					f1.delete();
					System.out.println("File Deleted");
					System.out.println(f1.getParentFile());		
				}else {
					System.out.println("File unavaliable");
					//executed the number of times file unavailable or available
				}
				
			}
		}
	}

}
