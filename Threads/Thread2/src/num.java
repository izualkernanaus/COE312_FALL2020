import java.util.Random;

public class num implements Runnable {

	Random r = new Random();

num (){
	
	//Runnable is NOT a Thread so we need a thread.
	
	// Create a thread and attach it to ourselves
	
	Thread t = new Thread(this);
	
	// start the thread. 
	
	t.start();
}

// my behavior -- DO NOT CALL run() directly.

public void run() {
 
	while(true) {
 
	 System.out.println("Thread "+this+" generated "+r.nextLong());
	 
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
}
}