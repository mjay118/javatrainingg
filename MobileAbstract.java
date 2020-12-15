abstract class Mobile{    
abstract String display(); 
abstract String os();   
}    
class Redmi extends Mobile{    
String display(){
return "LCD";
} 
String os(){
return "Snapdragon"; 
}  
}    
class Samsung extends Mobile{    
String display(){
return "OLED";
} 
String os(){
return "Exynos"; 
}  
}      
    
class MobileAbstract{    
public static void main(String args[]){    
Mobile m;  
m=new Redmi();  
System.out.println("Display "+m.display()+ "Operating System :"+m.os());    
m=new Samsung();  
System.out.println("Display "+m.display()+ "Operating System :"+m.os());    
}}    