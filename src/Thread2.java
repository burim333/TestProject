
public class Thread2 extends Thread {
	SynchTest st;

	public Thread2(SynchTest st, String threadName) {
		super(threadName);
		this.st = st;
	}

	@Override
	public void run() {
		synchronized (st) {
			st.display(this.getName());
		}
	}
}
