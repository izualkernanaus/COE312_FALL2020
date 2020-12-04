package client;

public class ComplexObserver extends ConcreteObserver implements Runnable {

	public ComplexObserver(ConcreteSubject[] subjects) {
		super(subjects);
		
		Thread t = new Thread(this);
		t.start();
	}

	
	@Override
	public void update(Message m) {
		
		System.out.println("received a "+ m.payload+" message from "+m.origin);
		
		if(m.topic=="time") {
			
			 // do nothing
			
		}
		else if(m.topic =="speaking") {
			System.out.println("some one is speaking.");
		}
	}
	
	
	@Override
	public void run() {
		while(true) {
			// do nothing because the message will be automatically printed
			// through update.
		}
	}

}
