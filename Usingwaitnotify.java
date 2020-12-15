class Customer
{  
int amount=10000;  
  synchronized void withdraw(int amount)
  {  
 System.out.println("going to withdraw");  
  if(this.amount<amount)
  {  
 System.out.println("Less balance going to deposit");  
try 
{
	wait();
	}
catch(Exception e)
{
	}  
}  
this.amount-=amount;  
System.out.println("withdraw completed");  
}  
  
synchronized void deposit(int amount)
{  
System.out.println("going to deposit");  
this.amount+=amount;  
System.out.println("deposit completed ");  
notify();  
}  
}  
  
class Usingwaitnotify 
{  
public static void main(String args[])
{  
 Customer ajay=new Customer();  
new Thread()
{  
public void run()
{
	ajay.withdraw(15000);
	}  
}.start();  
new Thread()
{  
public void run()
{
	ajay.deposit(10000);
}  
}.start();  
  
	}

}