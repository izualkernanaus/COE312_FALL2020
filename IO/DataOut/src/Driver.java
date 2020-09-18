import java.io.*;

public class Driver {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("data.txt");
		DataOutputStream data = new DataOutputStream(file);
		
		data.writeFloat((float) 3.14159);
		
		data.flush();
		data.close();
		
		System.out.println("Succcess...");
	}
}
