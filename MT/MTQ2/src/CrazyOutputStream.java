import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

class CrazyOutputStream {
	
	Random r = new Random();

	DataOutputStream dout;
	
	public CrazyOutputStream(OutputStream out) {
		dout=new DataOutputStream(out);
	}
	
	public void writeDouble(double d) throws IOException {
		dout.writeDouble(d);
		dout.writeDouble(r.nextDouble());
	}
	
	public void writeFloat(float d) throws IOException {
		dout.writeFloat(d);
		dout.writeFloat(r.nextFloat());
	}
	
	public void  close() throws IOException {
		dout.close();
	}
	
	
}