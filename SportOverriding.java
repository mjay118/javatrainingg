class Sports{  
 void players{
System.out.println("number of players");}  
}  
  
class Cricket extends players{  
void players(){
System.out.println("11 players");}  
}  

class SportOverriding{
public static void main(String args[]){    
Sports player = new Sports();      
player.players();  

}  
}  