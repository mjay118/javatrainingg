import java.util.*;  
class TreeMap{  
 public static void main(String args[]){  
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Amit");    
      map.put(102,"Ravi");    
      map.put(101,"Vijay");    
      map.put(103,"Rahul");    
        
      for(Map.Entry m:map.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());   
       System.out.println("headMap: "+map.headMap(102,true));   
       System.out.println("tailMap: "+map.tailMap(102,true)); 
       System.out.println("subMap: "+map.subMap(100, false, 102, true)); 
      }    
 }  
}  