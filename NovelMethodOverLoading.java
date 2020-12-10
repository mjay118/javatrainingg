class Novel{
void novels(){
System.out.println("SINTY,TYWL,2 STATES,MEMORABLE MEMOIR");
}
void orderedItem(String order){
System.out.println("Novel ordered is "+order);
}
void orderedItem(String order1,String order2){
System.out.println("Novel ordered is "+order1+" and "+order2);
}
void orderedItem(String order1,String order2,String order3){
System.out.println("Novel Ordered is "+order1+" and "+order2+" and "+order3);
}
}

class NovelMethodOverLoading{
public static void main(String args[]){
Novel book=new Novel();
book.novels();
book.orderedItem("SINTY");
book.orderedItem("MEMORABLE MEMOIR","SINTY");
book.orderedItem("TYWL","SINTY","MEMORABLE MEMOIR");
}
}