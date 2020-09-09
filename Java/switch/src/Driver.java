
public class Driver {

	public static void main(String[] args) {
		
		// Unlike C++ we can use integers OR even Strings. 
		
		int day = 4;
		switch (day) {
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
		}

		
		// can also do strings
		
		String day_string = "Sunday";
		switch (day_string) {
		  case "Sunday":
		    System.out.println("Today is Saturday");
		    break;
		  case "Monday":
		    System.out.println("Today is Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
		}
	}

}
