
public class SynchTest {
	String thread;
	public void display(String threadName) {
		thread = threadName;
		System.out.println("Entering now: " + threadName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(thread + " exit");
	}

}
