import java.util.Random;

public class num extends Thread {
Random r = new Random();

num (){
	this.start();  //actually start the thread
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