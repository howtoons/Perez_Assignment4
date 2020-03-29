package perez_problem1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		DuplicateRemover remover= new DuplicateRemover();
		
		try {
			remover.remove("problem1.txt");
		} catch (FileNotFoundException e) {
		System.out.println("file not found");
		}

		remover.write("unique_words.txt");
	}

}
