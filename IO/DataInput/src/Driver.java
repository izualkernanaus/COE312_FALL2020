import java.io.*;

public class Driver {
	public static void main(String[] args) throws IOException {
		
		InputStream input = new FileInputStream("data.txt");
		DataInputStream inst = new DataInputStream(input);
		
		float f = inst.readFloat();
		
		System.out.println(f);
		
	}
}
