
public class Thread1 extends Thread {

	SynchTest st;

	public Thread1(SynchTest st, String thread) {
		super(thread);
		this.st = st;

	}

	@Override
	public void run() {
		synchronized (st) {
			st.display(this.getName());
		}

	}

}