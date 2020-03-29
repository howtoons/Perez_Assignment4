package perez_problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemover {

	ArrayList<String> uniqueWords;
	
	public void remove(String dataFile) throws FileNotFoundException {
		
		File file= new File(dataFile);
		
		Scanner scan= new Scanner(file);
		
		uniqueWords= new ArrayList<String>();
		ArrayList<String> nonUnique= new ArrayList<String>();
		while(scan.hasNext()) {
			String next= (String)scan.next().toLowerCase();
			
			//System.out.println(next);
			if(uniqueWords.contains(next)) {
				uniqueWords.remove(next);
				nonUnique.add(next);
				
			}else {
				if(!nonUnique.contains(next))
					uniqueWords.add(next);
			}
			
		}	
		
		scan.close();
	}


	public void write(String outputFile) throws IOException {
		
		FileWriter writer= new FileWriter(outputFile);
		
		for(String s: uniqueWords) {
			writer.write(s+" ");
		}
		
		writer.close();
		
	}



}
