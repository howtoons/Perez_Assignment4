package perez_problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemover {

	ArrayList<String> uniqueWords;
	
	public void remove(String dataFile) throws FileNotFoundException {
		
		File file= new File(dataFile);
		
		Scanner scan= new Scanner(file);
		
		uniqueWords= new ArrayList<String>();
		
		while(scan.hasNext()) {
			String next= (String)scan.next().toLowerCase();
			if(uniqueWords.contains(next)) {
				uniqueWords.remove(next);
			}else {
				uniqueWords.add(next);
			}
			scan.close();
		}
		
	}

}
