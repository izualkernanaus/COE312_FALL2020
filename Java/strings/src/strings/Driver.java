package strings;

public class Driver {

	public static void main(String[] args) {
		
		String s = "how are you?";
		System.out.println(s.contains("me"));
		System.out.println(s.charAt(3));
		
		
		
		// concatenate string
		
		String s1 = "hello ";
		String s2 = "how are you";
		
		System.out.println(s1+s2);
		
		
		// going back between bytes and strings
		
		byte [] b = new byte[s.length()];
		b = s.getBytes();
		
		System.out.println((char)b[0]);
		
		

		
	}

}
