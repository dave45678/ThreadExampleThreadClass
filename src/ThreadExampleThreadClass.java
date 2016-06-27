public class ThreadExampleThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName() + " started.");
		
		Thread t2 = new IOThread();
		t2.start();
		/*** Below block simulates IO Operation in Main Thread ***/
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	
		System.out.println(t1.getName() + " starts " + t2.getName() + ".");
		
		System.out.println(t1.getName() + " finished."); 
	}

}

