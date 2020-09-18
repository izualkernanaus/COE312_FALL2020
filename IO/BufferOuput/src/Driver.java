import java.io.*;

public class Driver {
	public static void main(String args[]) throws Exception {
		
		
		FileOutputStream fout = new FileOutputStream("output.txt");
		
		
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Welcome to COE312 again.";
		byte b[] = s.getBytes();
		
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		
		System.out.println("success");
	}
} 