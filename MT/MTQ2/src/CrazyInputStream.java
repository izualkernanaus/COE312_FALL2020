import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

class CrazyInputStream {

	DataInputStream din;
	
	public CrazyInputStream(InputStream in) {
		din=new DataInputStream(in);
	}
	
	public double readDouble() throws IOException {
		return din.readDouble()*din.readDouble();
	}
	
	public float readFloat() throws IOException {
		return din.readFloat()+din.readFloat();
	}
	
	public void  close() throws IOException {
		din.close();
	}
	
}