package com.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FileWriter writer;
		try {
			writer = new FileWriter("E:\\bufferedWriter.txt");
			BufferedWriter buffer = new BufferedWriter(writer);  
			buffer.write("This is BufferedWriter Program.");  
		    buffer.close();  
		    System.out.println("Result Success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		 
	}

}
