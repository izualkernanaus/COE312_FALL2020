package strings;

public class Driver {

	public static void main(String[] args) {
		
		String s = null;  // because s is an address of a string
		System.out.println(s);
		
		s = "hello how are you?";
	
		System.out.println(s);
		
		
		
		String txt = "Hello World";
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"
		
		
		System.out.println(s.charAt(4));
	
		// there is an "are" in the string
		System.out.println(s.contains("are"));
		
		
		// there is an "are" AND it starts at index 10
		System.out.println(s.indexOf("are"));
		
		
		// if not there u will get a -1
		System.out.println(s.indexOf("tarzan"));
		
		/*
		
		// concatenate string
		
		String s1 = "hello ";
		String s2 = "how are you";
		
		System.out.println(s1+s2);
		
		
		// going back between bytes and strings
		
		byte [] b = new byte[s.length()];
		b = s.getBytes();
		
		System.out.println((char)b[0]);
		*/
		

		
	}

}
