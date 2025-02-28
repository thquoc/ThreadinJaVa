package TH4;

public class ThreadRuttien extends Thread {
	private long tienrut;
	private ATM atm;
	
	public ThreadRuttien(long tienrut, ATM atm) {
		// TODO Auto-generated constructor stub
		this.atm = atm;
		this.tienrut = tienrut;
	}
	public void run() {
		try {
			this.atm.rutTien(tienrut);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
