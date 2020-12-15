class PgmLanguage{
 void show(){
  System.out.println("Programming");
 }
}

class C extends PgmLanguage{
 void display(){
  System.out.println("C Language");
 }
}

class Java extends PgmLanguage{
 void java_display(){
  System.out.println("Java Programming");
 }
}

class MultilevelProgrammingLanguage{
 public static void main(String args[]){
  Java j=new Java();
  
  j.show();
  j.display();
  j.java_display();
 }
}