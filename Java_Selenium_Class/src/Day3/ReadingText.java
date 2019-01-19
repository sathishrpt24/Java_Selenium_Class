package Day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingText {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\acer\\git\\Java_Selenium_Class\\Java_Selenium_Class\\src\\ReadFile\\file1.txt");
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String st ;
		
		while((st= br.readLine()) != null) {
			
			System.out.println(st);
			
		}
		
		br.close();
	}

}
