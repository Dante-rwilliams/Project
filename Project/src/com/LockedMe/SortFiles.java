package com.LockedMe;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortFiles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	File dir = new File("/Users/dante/eclipse-workspace/CompanyLockersPrototypeApp/src/com/prototype/Files"); //replace it with your path
	if(dir.isDirectory()) {
		List<String> list=Arrays.asList(dir.list());
		System.out.println("Files are in ascending order");
		
		for(String s:list) {
			System.out.println(s);
		}
	}
	else {
		System.out.println("No files Found");
	}
}
	}
