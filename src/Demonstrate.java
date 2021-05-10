
public class Demonstrate {

	public static void main(String[] args) throws InterruptedException {
		SynchTest st = new SynchTest();
		Thread1 th1 = new Thread1(st, "Thread 1");
		Thread2 th2 = new Thread2(st, "Thread 2");
		
		
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
	}

}
