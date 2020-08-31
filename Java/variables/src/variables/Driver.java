package variables;

public class Driver {

	public static void main(String[] args) {
		
		
		// primitive variables
		// these start with "small letters"
		// behave like C++ except
		// cannot have pointers to primitive variables
		
		int x = 10;
		double y = 20.0;
		System.out.println(x);
		System.out.println(y);
		
		// int *p;  //cannot do this
		
		// However, everything is a pointer in Java
		// EXCEPT primitive variables. 
		// Everything else is a Class variable.
	    
		Integer i;   // same as int * i;
		
		i = new Integer(100); // i = new int(100)
		
		System.out.println(i);
		
		/*
		//converting between class and primitive variables
		
	
		// using valueof
		i = Integer.valueOf("231");
		i = Integer.parseInt("123");
		
		*/

	}

}
