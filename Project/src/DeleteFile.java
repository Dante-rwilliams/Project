

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file= new File("/Users/dante/Documents/GitHub/Project/Project/src/com/LockedMe/A.txt");

		if(file.delete()) {
			
			System.out.println("deleted");
		}
		
		else {
			System.out.println("not deleted");
		}
		
		
	}

}
