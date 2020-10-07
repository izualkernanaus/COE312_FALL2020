import java.io.*;

public class Driver {
	public static void main(String args[]) throws Exception {
		
		
		// create the fileoutput stream
		
		FileOutputStream fout = new FileOutputStream("output.txt");
		
		// connect to buffered output
		
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		
		String s = "Welcome to COE312 again on September 28, 2020.";
		byte b[] = s.getBytes();
		
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		
		System.out.println("success");
	}
} 