import java.io.FileInputStream;

public class Driver {
	public static void main(String args[]) {
		
		try {
			
			// create an input file stream
			
			FileInputStream fin = new FileInputStream("input.txt");
			
			int i = fin.read(); // reads an int 
			
			
			System.out.print((char) i); // convert it into char. 

			// close the file -- it will also flush (we dont care)
			fin.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}