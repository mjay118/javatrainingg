package com.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Reader reader = new FileReader("E:\\writer.txt");
			int data = reader.read();  
            while (data != 0) {  
                System.out.print((char) data);  
                data = reader.read();  
            }  
            reader.close();  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

}
