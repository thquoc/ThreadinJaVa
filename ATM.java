package TH4;

import java.util.Scanner;

public class ATM  {
	private long soDu;
	
	public ATM(long soDu) {
		// TODO Auto-generated constructor stub
		this.soDu = soDu;
		
	}
	
	public void setSoDu(long soDu) {
		this.soDu = soDu;
	}
	public long getSoDu() {
		return soDu;
	}
	
	
	protected synchronized void rutTien(long ruttien) throws InterruptedException{
		
		if(this.soDu >= ruttien) {
			this.soDu -= ruttien;
			System.out.println("Da rut: "+ ruttien +" So du hien tai: " + this.soDu);
			
			
		}else {
			System.out.println("Khong du tien! Cho nap tien....");
			wait();
		}
		
	}
	
	protected synchronized void napTien(long naptien) throws InterruptedException {
	
		this.soDu += naptien;
		System.out.println("Da nap: "+ naptien +" So du hien tai: " + this.soDu);
		notify();
		
	}
	public static void main(String[] args) throws InterruptedException {
		ATM atm = new ATM(5000);
		try (Scanner k = new Scanner(System.in)) {
			while(true){
				
				System.out.println("Nhap so tien can rut: ");
				long tienrut = k.nextLong();
				new ThreadRuttien(tienrut, atm).start();
				
				System.out.println("Nhap so tien can nap: ");
				long tiennap = k.nextLong();
				new ThreadNaptien(tiennap, atm).start();
				
			}
		}
	}

}


