import java.io.*;

public class Driver {
	public static void main(String[] args) throws IOException {
		
		// use the wrapper idea. 
		
		FileOutputStream file = new FileOutputStream("data.txt");
		
		// FileOutputStream does not know how to write data.
		
		DataOutputStream data = new DataOutputStream(file);
		
		data.writeFloat((float) 4.0557282E-8);
		data.writeFloat((float) 3.14159);
		data.writeFloat((float) -44.234);
		
		data.flush();
		data.close();
		
		System.out.println("Succcess...");
	}
}
