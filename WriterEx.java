package com.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writer w;
		try {
			w = new FileWriter("E:\\writer.txt");
			 String content = "Programming is very intresting";  
		        w.write(content); 
		        w.close();  
	            System.out.println("Result success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
       
	}

}
