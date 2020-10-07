import java.io.*;

public class PrintableInputStream extends FilterInputStream {

public PrintableInputStream(InputStream inp) 
{ 
	super(inp); 
}

public int read() throws IOException 
{ 
	// I will not use my parent's read first. 
	
	int b = in.read(); 
	
	// filter
	
	if (b >= 32 && b <= 66) return b; // 32 to 126 is printable
	else if (b == 10 || b == 13 || b == 9 || b == -1) return b; // non-printing characters 
	else return '?'; 
}

}