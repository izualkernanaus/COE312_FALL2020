public class SoftException extends Exception implements Yellow, Green{
	
	String whyyellow;
	String whygreen;
	String whenapplies;
	String whendoesnotapply;

	SoftException(String whygreen, String whyyellow, String whenapplies, String whendoesnotapply){
		super("This exception can potentially be ignored");
		this.whyyellow= whyyellow;
		this.whenapplies =whenapplies;
		this.whendoesnotapply = whendoesnotapply;
		this.whygreen = whygreen;
	}
	
	public String whyyellow() {
		// TODO Auto-generated method stub
		return whyyellow;
	}
	@Override
	public String whenapplies() {
		// TODO Auto-generated method stub
		return whenapplies;
	}
	@Override
	public String whendoesnotapply() {
		// TODO Auto-generated method stub
		return whendoesnotapply;
	}
	
	public String toString() {
		return super.getMessage()+" and it applies when "+whenapplies()+" and does not apply when "+whendoesnotapply()+", and it is also green because "+whygreen();
	}

	@Override
	public String whygreen() {
		// TODO Auto-generated method stub
		return whygreen;
	}
}