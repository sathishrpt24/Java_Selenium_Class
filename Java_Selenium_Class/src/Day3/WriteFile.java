package Day3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		
		PrintWriter data = new PrintWriter("demo.txt");
		
		data.write("Line 1");
		data.write("Line 2");
		data.close();

	}

}
