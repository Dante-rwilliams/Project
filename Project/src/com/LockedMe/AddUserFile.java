package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AddUserFile {

	public static void main(String[] args) throws IOException {

		Path path=Paths.get("/Users/dante/Documents/GitHub/Project/Project/src/com/LockedMe/A.txt");
		//File("/Users/dante/Documents/GitHub/Project/Project/src/com/LockedMe/A.txt");
		Files.createDirectories(path.getParent());
		
		try {
			Files.createFile(path);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
