
class Trainees{
	public synchronized void message(String companyName) {
		for(int i=0;i<5;i++) {
			System.out.print("Welcome to ");
			try {
				System.out.println(companyName);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread extends Thread{
	Trainees t;
	String companyName;
	MyThread(Trainees t,String companyName) {
		this.companyName=companyName;
		this.t=t;
	}
	public void run() {
		t.message(companyName);
	}
}
public class SynchronisedDemo {

	public static void main(String[] args) {
		Trainees ajay=new Trainees();
		MyThread mt=new MyThread(ajay, "Motivity");
		MyThread mt1=new MyThread(ajay, "JNIT");
		mt.start();
		mt1.start();
	}

}

