import java.util.Random;

public class num implements Runnable {
Random r = new Random();

num (){
	Thread t = new Thread(this);
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