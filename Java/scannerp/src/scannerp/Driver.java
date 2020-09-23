package scannerp;


//we need this class called Scanner
//from the library called java.util. 
//import is similar to #include in C++
//except in this case rather than importing a text file
//it actually imports a class. 

import java.util.Scanner;  

public class Driver {

	public static void main(String[] args) {
		
		// Scanner class is used to read input from System.in.
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object with System.in
	    System.out.println("Enter username");

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("Username is: " + userName);  // Output user input
	    

	}

}
