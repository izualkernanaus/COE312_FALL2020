import java.io.*;

public class Driver {
	public static void main(String[] args) throws IOException {

		// to read from a file
		InputStream input = new FileInputStream("data.txt");

		// to read data I wrap it
		DataInputStream inst = new DataInputStream(input);

		// cannot use -1 for EOF?
		// How do you look for EOF?

		// For data input stream we need to
		// use EXCEPTIONS to check for EOF!

		// DO NOT USE try/catch to EOF if 
		// you are using the read() function.
		// while(true) { x.read();} will keep printing -1
		// and NO exception.
		
		try {

			while (true) {
				float f = inst.readFloat();
				System.out.println(f);
			}

		} catch (Exception e) {
			System.out.println("read EOF");
		}

		// System.out.println(f);

	}
}
