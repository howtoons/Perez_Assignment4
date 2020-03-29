package perez_problem2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
	public static void main(String[] args) {
		DuplicateCounter counter = new DuplicateCounter();
		
		try {
			counter.count("problem2.txt");
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found");
		}
		
		try {
			counter.write(" unique_word_counts.txt");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
