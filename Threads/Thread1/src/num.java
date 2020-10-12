import java.util.Random;

public class num extends Thread {
 
Random r = new Random();

num (){
	this.start();  //actually start the thread
	
	// start() does: 
	// 1.  Do some bookkeeping.
	// 2.  Call the run() function. 
}

// my behavior -- DO NOT CALL run() directly.
// run() is the main() of each thread.

public void run() {
 
	while(true) {
 
	 System.out.println("Thread "+this+" generated "+r.nextLong());
	 
	 try {
		
		// sleep for 1 second
		 
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
}
}