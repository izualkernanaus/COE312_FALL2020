
import java.io.FileInputStream;

public class Driver2 {
	public static void main(String args[]) {
		try {
			
			// create an input stream
			
			FileInputStream fin = new FileInputStream("input.txt");
			
			int i = 0;
			
			// using -1 as an EOF
			
			/*
			while ((i = fin.read()) != -1) {
				
				System.out.print((char) i);
			
			}
			*/
			
			boolean eof=false;
			
			while(!eof) {
				
				// if there is atleast one byte
				
				if(fin.available()>0) {
					
					i=fin.read(); // read it
					
					if(i==-1) eof=true; // -1 so exit
					
					System.out.println((char)i ); // print
					
				}
				
			}
			
			
			/*
			while(true) {
				System.out.print(fin.read());		
			}
			*/
			
			fin.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
