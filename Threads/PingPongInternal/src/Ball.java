
public class Ball {
	String state = "ping";

	public synchronized String getState() {
		return state;
	}

	public synchronized void setState(String state) {
		this.state = state;
	}
	
}
