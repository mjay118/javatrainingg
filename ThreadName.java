public class ThreadName extends Thread{
	@Override
	public void run() {
		System.out.println("Running.......!"+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadName t1=new ThreadName();
		ThreadName t2=new ThreadName();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.setName("Name1");
		t2.setName("Name2");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		t2.start();
	}

}