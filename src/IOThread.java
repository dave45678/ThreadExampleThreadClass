
public class IOThread extends Thread {
	@Override
	public void run() {
		System.out.println(this.getName() + " started.");
		
		try {
			Thread.sleep(10); //Sleep for 2 seconds to simulate an IO task 
								// that takes a long time
		} catch (InterruptedException e) {
			// Ignoring it here...
		}
		System.out.println(this.getName() + " finished.");
	}
	
}
