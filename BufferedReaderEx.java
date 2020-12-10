package com.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		try {
			fr = new FileReader("E:\\bufferedWriter.txt");
			BufferedReader br=new BufferedReader(fr); 
			 int i;    
	          while((i=br.read())!=-1){  
	          System.out.print((char)i);  
	          }  
	          br.close();    
	          fr.close();    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
        
	}

}
