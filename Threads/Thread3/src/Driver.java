
public class Driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		print n1 = new print(10);
		print n2 = new print(15);

		
		n1.get_thread().join();
		n2.get_thread().join();
		
		System.out.println("Hasta Lavista Baby!");


	}

}
