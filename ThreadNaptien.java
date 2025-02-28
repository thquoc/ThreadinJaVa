package TH4;

public class ThreadNaptien extends Thread {
	private long tiennap;
	private ATM atm;
	
	public ThreadNaptien(long tiennap, ATM atm) {
		// TODO Auto-generated constructor stub
		this.tiennap = tiennap;
		this.atm = atm;
	}
	public void run() {
		try {
			this.atm.napTien(tiennap);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
