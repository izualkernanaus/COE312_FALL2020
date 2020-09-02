package variables;

public class Driver {

	public static void main(String[] args) {
		
		
		// primitive variables
		// these start with "small letters"
		// behave like C++ except
		// cannot have pointers to primitive variables
		
		int x = 10; // this a primitive!
		double y = 20.0;
		//System.out.println(x);
		//System.out.println(y);
		
		// int *p;  //cannot do this
		
		// However, everything is a pointer in Java
		// EXCEPT primitive variables. 
		// Everything else is a Class variable.
	    
		Integer i;   // same as int * i;
		//Integer i is just an address variable. 
		//i is an Address (pointer to) of an Integer.
		
		i = new Integer(100); // i = new int(100)
		
		i = 200; // this does not make sense. i is an address?
		         // secretly does i = new Integer(200).
		
		
		System.out.println(i);
		
		
		i = x;  // same problem address = int xx
		        // secretly the system did i = new Integer(x)
		
		x = i;  // int x = address + 1   *i++;
		
		          // secretly does this x = i.valueof() + 1 
		
		System.out.println(x);
		
		double myDouble = 9.78;
	    int j = (int) myDouble;
	    
	    System.out.println(j);
		
	
		//converting between class and primitive variables
		
	
		// using valueof
		// Integer is a Class. 
		
		// Cat.jump()   /// did you do this in C++?
		
		// Cat c = new Cat();
		// c.jump();
		
		
		i = Integer.valueOf("23183838");
		
		// write a program to take "123" and convert it to 
		// the number 123
		
		System.out.println(i);
		
		i = Integer.parseInt("123");
		
		// Big difference with respect to boolean.
		// in Java Boolean is a Boolean and NOT an integer
		
		boolean isJavaFun = true;
	    boolean isFishTasty = false;
	    
	    System.out.println(isJavaFun);     // Outputs true
	    System.out.println(isFishTasty);   // Outputs false
	    
		

	}

}
