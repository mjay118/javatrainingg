package training;
import java.lang.Math;
public class Calculator {
int num1;
int num2;
double num11;
public Calculator(int num1, int num2, double num11) {
	super();
	this.num1 = num1;
	this.num2 = num2;
	this.num11 = num11;
}
	
public static int powerInt(int num1,int num2) {
	
return (int) Math.pow(num1, num2);

}
public static double powerDouble(double num11,int num2) {
	
return (double) Math.pow(num11, num2);

}
public static void main(String args[]) {
	
	System.out.println(powerInt(5,2));
	System.out.println(powerDouble(5.0,2));
}

}