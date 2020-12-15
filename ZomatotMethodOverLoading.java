class Zomato{
void food_items(){
System.out.println("Briyani,paneer,chicken,chicken drumstick");
}
void orderedItem(String order){
System.out.println("Food ordered is "+order);
}
void orderedItem(String order1,String order2){
System.out.println("Food ordered is "+order1+" and "+order2);
}
void orderedItem(String order1,String order2,String order3){
System.out.println("Food Ordered is "+order1+" and "+order2+" and "+order3);
}
}

class ZomatotMethodOverLoading{
public static void main(String args[]){
Zomato food=new Zomato();
food.food_items();
food.orderedItem("Briyani");
food.orderedItem("Paneer","chicken");
food.orderedItem("Briyani","Paneer","chicken");
}
}