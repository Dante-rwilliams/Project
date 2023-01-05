package com.LockedMe;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortFiles {

	public static void createMainFolder(String folderName) {
		File m_Folder = new File(folderName);

		// Check for folder name, if it does not exist a main folder is created
		if (!m_Folder.exists()) {
			m_Folder.mkdirs();
		}
	}

	public static void SortAllFiles(String path) {
		//Pass the name of the folder that was created 
		SortFiles.createMainFolder("Main");

		// listFilesInDirectory displays files along with folder structure
		List<String> filesListNames = SortFiles.listFilesInDirectory(path, new ArrayList<String>());

		System.out.println("Files are sorted in ascending order \n");
		Collections.sort(filesListNames);

		filesListNames.stream().forEach(System.out::println);
	}
		
		
		public static List<String> listFilesInDirectory(String path, List<String> fileListNames) {
			File directory = new File(path);
			File[] files = directory.listFiles();
			List<File> filesList = Arrays.asList(files);

			Collections.sort(filesList);

			if (files != null && files.length > 0) {
				for (File file : filesList) {

					if (file.isDirectory()) {
						System.out.println("**" + file.getName());

						fileListNames.add(file.getName());
						listFilesInDirectory(file.getAbsolutePath(), fileListNames);
					} else {
						System.out.println(">> " + file.getName());
						fileListNames.add(file.getName());
					}
				}
			} else {
				System.out.println("|-- NO FILE FOUND");
			}
			System.out.println();
			return fileListNames;
		}

	}

