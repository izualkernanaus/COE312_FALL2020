
public class Racket implements Runnable {
	Ball b;

	Racket(Ball b) {
		this.b = b;

		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		
		synchronized(this) {

		while (true) {
			if (b.state == "ping")
				b.state = "pong";
			else if (b.state == "pong")
				b.state = "ping";

			System.out.println(this + " state=" + b.state);
		}
		
		}
	}
}

