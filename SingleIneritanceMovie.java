import java.util.Scanner;
class Movie{
 String movieName;
 void input(String name){
  movieName = name;
 }
}

class Actor extends Movie{
 String actorName;
 void input_actor(String name){
  actorName = name;
 }
}

class SingleIneritanceMovie{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  MovieName name=new MovieName();
  name.input(sc.next());
  name.input_actor(sc.next());
  System.out.println("Movie Name is: "+name.movieName+" "+"Actor: "+name.actorName);
 }
}