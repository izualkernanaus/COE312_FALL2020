package continueexample; //make namespace continueexample 
                         //put this class in namespace called continueexample

public class Driver {

	public static void main(String[] args) {
	
	/*
	 while(true)
	 {
		while(true) {
			
			System.out.println(2);
			break;
		}
		
		System.out.println(3);
		break;
	
	 }
	}
	
	*/
	
		// break will kick us out of the "enclosing"
		
		for (int i = 0; i < 10; i++) {
			
			
			if (i == 2) {
				break;
			}
			
			System.out.println(i);
		}
		
		
		// continue will kick us out of the inner loop 
		
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
	
	
	}

}
