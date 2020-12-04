package client;

public class Driver {

	public static void main(String[] args) {
		
		TCP_Client phone = new TCP_Client("192.168.0.110", 1234); // to start the server
		Clock clock1 = new Clock(1); //every second
		Clock clock2 = new Clock(5); //every 5 second
		
		
		ConcreteSubject[] subjects = {phone, clock1, clock2};
		
		SimpleObserver c1 = new SimpleObserver(subjects);
		ComplexObserver c2 = new ComplexObserver(subjects);
		MoreComplexObserver c3 = new MoreComplexObserver(subjects);
	}

}
