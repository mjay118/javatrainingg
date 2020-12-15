import java.util.Scanner;

public class JoinDemo extends Thread{
	int x,y;
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x,y values");
		x=sc.nextInt();
		y=sc.nextInt();
	}

	public static void main(String[] args) throws InterruptedException {
		JoinDemo jd=new JoinDemo();
		jd.start();
		jd.join();
		System.out.println("Sum:"+(jd.x+jd.y));
	}

}
