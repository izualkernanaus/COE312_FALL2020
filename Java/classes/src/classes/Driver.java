package classes;

public class Driver {
	
public static void main(String[] args) {
		
	// What does this mean in C++;
	// Creating an object of type Cat (ONLY IN C++)
	
	
	Cat c;  // c is an address of a cat (pointer)
	        // Cat * c;  in C++
	
	// how to create an instance of a Cat. 
	
	c = new Cat();  // will this work in C++.
	                // in Java we need () for the default const. 
	
	Cat d = new Cat("Foofoo", 15);
	
	System.out.println(d); // what will this print?
	
	// call the function 
	
    d.speak();  // in c++ you would have done c->speak();
    
  
    // Mamal m = new Mamal(); // does this make sense? NO. 
	
	
}
}
