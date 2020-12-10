
class Restaurant{
void menu(){
System.out.println("dosa,idli,vada,utappam,upma");
}
void takeOrder(String order){
System.out.println("Order given is "+order);
}
String serveFood(){
return "dosa";
}
int giveBill(){
return 421;
}
String payBill(int amount){
System.out.println("Amount given is "+amount);
return "paid";
}
}

class Customer{
public static void main(String[] args){
Restaurant paradise=new Restaurant();
paradise.menu();

}
}