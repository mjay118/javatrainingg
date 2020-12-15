import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class MaxNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		n=sc.nextInt();  
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{    
		array[i]=sc.nextInt();  
		}  
		TreeSet<Integer> t = new TreeSet<Integer>();
          for(Integer number : array){
            t.add(number);
          }
            Integer[] array1=new Integer[t.size()];
            array1=t.toArray(array1);
            if(array1.length<3) {
            	System.out.println("Second Max no. "+array1[(array1.length)-2]);
            }
            else {
            System.out.println("Third Max no. "+array1[(array1.length)-3]);    
            }
        
          
	}

}
