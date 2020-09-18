import java.io.FileInputStream;

public class Driver {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("input.txt");
			
			int i = fin.read(); // reads an int 
			
			
			System.out.print((char) i); // convert it into char. 

			fin.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}