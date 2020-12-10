import java.util.Scanner;
class Team{
 String teamName;
 void input(String name){
  teamName = name;
 }
}

class Captain extends Team{
 String captainName;
 void captain(String name){
  captainName = name;
 }
}

class SingleIneritanceTeam{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  Team name=new Team();
  name.input(sc.next());
  name.captain(sc.next());
  System.out.println("Team Name is: "+name.teamName+" "+"Captain: "+name.captain);
 }
}