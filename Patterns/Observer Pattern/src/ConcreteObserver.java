public class ConcreteObserver implements Observer {

	private Subject subject;

	public ConcreteObserver(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	public void update() {
		System.out.println("do nothing from " + this);
	}
}