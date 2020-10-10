
public class Driver {

	public static void main(String[] args) throws InterruptedException {
		
		String notebook = "shared notebook";
		String pencil = "shared pencil";
		
		// female students
		for (int i = 0; i<10; i++)
		new female_student(notebook, pencil);
		
		// male students
		for (int i = 0; i<10; i++)
		new male_student(notebook, pencil);


	}

}
