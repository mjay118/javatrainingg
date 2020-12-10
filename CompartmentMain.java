package training;

import java.util.Random;

public class CompartmentMain {
public static void main(String[] args) {
	
	Compartment com[]=new Compartment[10];
	Random rnd=new Random();
	int num=0;
	for(int i=0;i<10;i++){
		num=rnd.nextInt(4);
		if(num==0)
			com[i]=new firstclass();
		else if(num==1)com[i]=new Ladies();
		else if(num==2)com[i]=new General();
		else if (num==3)com[i]=new Luggage();
		com[i].notice();
		System.out.println();
		}
	
}
}
