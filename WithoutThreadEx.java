    class NoThread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i value is:"+i);
		}
	}
}
public class WithoutThreadEx {

	public static void main(String[] args) {
		NoThread t=new NoThread();
		t.run();
		for(int i=0;i<=10;i++) {
			System.out.println("x value is:"+i);
		}
	}

}