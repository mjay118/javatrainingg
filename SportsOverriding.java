class Books{  
 void readership{
System.out.println("Different readers like different genre");}  
}  
  
class Fiction extends Books{  
void readership(){
System.out.println("Most readers like Fiction");}  
}  
class NonFiction extends Books{  
void readership(){
System.out.println("It has low readership than fiction");}  
}  
class BooksOverriding{
public static void main(String args[]){    
Fiction readers_interest = new Fiction();      
readers_interest.readership();  
NonFiction nonfiction_reader = new NonFiction();      
nonfiction_reader.readership();
}  
}  