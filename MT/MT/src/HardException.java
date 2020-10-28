public class HardException extends Exception implements Red{

	String whyred;
	String panelty;
	
	HardException(String whyred, String panelty){
		super("This exception cannot be ignored");
		this.whyred= whyred;
		this.panelty = panelty;
	}
	
	public String whyred() {
		return whyred;
	}
	@Override
	public String penalty() {
		return panelty;
	}
	
	public String toString (){
		try {
			throw new Exception("This exception must be addressed because "+whyred()+" and the penalty is '"+penalty()+"'");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// this is dummy, it will never get here.
		return "";
	}
}