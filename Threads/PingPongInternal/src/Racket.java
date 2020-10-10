
public class Racket implements Runnable {
	Ball b;

	Racket(Ball b) {
		this.b = b;

		Thread t = new Thread(this);
		t.start();
	}

	public void run() {

		while (true) {
			if (b.getState() == "ping")
				b.setState("pong");
			else if (b.getState()== "pong")
				b.setState("ping");

			System.out.println(this + " state=" + b.state);
		}
	}
}

