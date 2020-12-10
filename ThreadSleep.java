
public class ThreadSleep extends Thread {
	public void run()
	{
		for(int i=1; i<6;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static  void main(String[] args)
	{
		ThreadSleep a= new ThreadSleep();
		a.start();
	}
	}

