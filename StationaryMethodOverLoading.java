class Stationary{
void items(){
System.out.println("Pen,Pencil,Copy,colour");
}
void orderedItem(String order){
System.out.println("Item ordered is "+order);
}
void orderedItem(String order1,String order2){
System.out.println("Item ordered is "+order1+" and "+order2);
}
void orderedItem(String order1,String order2,String order3){
System.out.println("Item Ordered is "+order1+" and "+order2+" and "+order3);
}
}

class StationaryMethodOverLoading{
public static void main(String args[]){
Stationary items=new Stationary();
items.novels();
items.orderedItem("Pen");
items.orderedItem("Pen","copy");
items.orderedItem("colour","pencil","copy");
}
}