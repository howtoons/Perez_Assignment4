package perez_problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
	
	Map<String, Integer> wordCounter;
	
	public void count(String dataFile) throws FileNotFoundException {
		File file = new File(dataFile);
		Scanner input= new Scanner(file);
		
		wordCounter= new HashMap<String, Integer>();
		
		
		while(input.hasNext()) {
			String next=input.next();
			
			if(wordCounter.containsKey(next)) {
				wordCounter.replace(next, (wordCounter.get(next) + 1 ));
			}else {
				wordCounter.put(next, 1);
			}
			
		}
		
		
		input.close();
	}
	
	public void write(String outputFile) throws IOException {
		FileWriter out= new FileWriter(outputFile);
		
		out.write(wordCounter.toString());
		
		out.close();
	}
}
