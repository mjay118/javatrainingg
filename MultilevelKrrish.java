class Movie{
 void show(){
  System.out.println("Movie");
 }
}

class Koi_mil_gaya extends Movie{
 void display(){
  System.out.println("1 part in series");
 }
}

class Krrish extends Koi_mil_gaya{
 void krrish_display(){
  System.out.println("2 part in series");
 }
}

class MultilevelKrrish{
 public static void main(String args[]){
  Krrish k=new Krrish();
  
  k.show();
  k.display();
  k.krrish_display();
 }
}