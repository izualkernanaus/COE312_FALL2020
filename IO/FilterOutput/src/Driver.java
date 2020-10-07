import java.io.IOException;

public class Driver {
	public static void main(String[] args) {
		
		PrintableInputStream s = new PrintableInputStream(System.in);
		
		while (true) {
			try {
				System.out.print((char) s.read());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
