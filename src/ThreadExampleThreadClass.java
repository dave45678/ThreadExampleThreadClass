public class ThreadExampleThreadClass {

	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName() + " started.");
		
		Thread t2 = new IOThread();
		/*Causes this thread to begin execution; 
		 * the Java Virtual Machine calls the run method of this thread. 
		 * The result is that two threads are running concurrently: 
		 * the current thread (which returns from the call to the start method) 
		 * and the other thread (which executes its run method).
		 */
		t2.start();
		/*** Below block simulates IO Operation in Main Thread ***/
		
		try {
			//Causes the currently executing thread to sleep (temporarily cease execution) 
			//for the specified number of milliseconds, 
			//subject to the precision and accuracy of system timers and schedulers
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	
		System.out.println(t1.getName() + " starts " + t2.getName() + ".");
		
		System.out.println(t1.getName() + " finished."); 
	}

}

