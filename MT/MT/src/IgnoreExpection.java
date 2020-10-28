
public class IgnoreExpection extends Exception implements Green {

	
	String whygreen;
	
	IgnoreExpection(String whygreen){
		super("This exception must be ignored");
		this.whygreen = whygreen;
	}

	@Override
	public String whygreen() {
		// TODO Auto-generated method stub
		return whygreen;
	}
	
	public String toString() {
		return super.getMessage()+" and it is green because "+whygreen();
	}
	
}