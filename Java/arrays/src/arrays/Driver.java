package arrays;

public class Driver {

	public static void main(String[] args) {
		
		// read this backwards. 
		
		// cars is an address (pointer) of (to) an array [] of String 
		String[] cars;
		
		// ints is an address of an array of integers.
		Integer [] ints = null;  
		
		// ints --> array of addresses to Integer
		// ints is an address
				
		System.out.println(ints);
		
		
		// how do you think about arrays.
		
		//***************** Arrays of primitives   *****************/
		
		// please do not do this -- you will confuse yourself.
		// int a[] = null will work. 
		
		int [] a= null;
		
		
		// a --> an array of integers.
		// a is an address
		
		
		//System.out.println(a.length);
		
		// read this as an address of array of int?
		
		// left Address of an array 
		// new gives me the address of an array with 10 ints.
		
		int [] b = new int[ 10 ];
		System.out.println(b.length);
		// read this as b is an address to an array of integers.
		// this address points to an array with 10 elements. 
		
				
		int[] c = new int[]{3,2,5,4,1};
		System.out.println(c[0]);
		System.out.println(c.length);
		
		// same as above
		
		int[] ee = {7,-2,-5,-4,1}; // does new secretly and creates an array
		System.out.println(ee[0]);
		System.out.println(ee.length);
		
		// b is an address to an array of integers. 
		
		
		//***************** Arrays of Objects   *****************/
		// We can do the same thing. 
		
		// Please do not do this!!
		// Integer d[] = null;
		
		Integer []  d = null;
		      
		//System.out.println(d.length);
		
		// read this as an address of array of int?
		
		Integer [] e = new Integer[ 10 ];
		System.out.println(e.length);
		// read this as b is an address to an array of integers.
		// this address points to an array with 10 elements. 
		
				
		Integer[] f = new Integer[]{-1,-2,-3,-4,-5};
		System.out.println(f.length);
		
		
		// iterating over an array
		for(int i = 0; i<f.length; i++) {
			System.out.println(f[i]);
		}
		
		
		// same thing can also be said like
		// us i Integer to iterate over f which is an array.
		// ONLY for going from 0 to f.length
		
		for (Integer i : f) {
			  System.out.println(i);
		}
		
		
		    
		// more examples
		
		String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};  // new String[4]
		
		// read -- cars is an address to an array of strings
		
		
		// how can we check the Type of cars?
		// Reflection in Java can inspect the class
		
		System.out.println(cars2.getClass().getTypeName());
		
		
		// 2D array
		
		//Integer [] [] g; 
		
		//g = {{1, 2, 3},{4,5,6}};  //this is an array
		
		// Java arrays are row-major -- row by row.
		// row1 = {1, 2, 3, 4}
		// row2 = {5, 6, 7}
		
	    // This is different than C++ where YOU CNANOT DO THIS.
		     
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		
		
		for(int i = 0; i <2; i++) {
			for(int j = 0 ; j<4; j++) {
				System.out.println(myNumbers[i][j]);
			}
		}
		
	}

}
