
public class Driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		print n1 = new print(10);
		print n2 = new print(15);

		
		// give me the thread which is running n1
		// I (main) will wait until n1 finishes running. 
		n1.get_thread().join();
		
		// give me the thread that is running n2
		// I (main) will wait until n2 finishes running.
		// n2.get_thread().join();
		
		System.out.println("Hasta Lavista Baby!");
		
		// how we grab the thread of ourselves 
		
		// this will lock for ever 
		
		// Thread.currentThread().join();
		
		// After the join
		System.out.println("main after the join");


	}

}
