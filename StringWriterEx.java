package com.files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

public class StringWriterEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char[] ary = new char[512];  
        StringWriter writer = new StringWriter();  
        FileInputStream input = null;  
        BufferedReader buffer = null;  
        input = new FileInputStream("E://writer.txt");  
        buffer = new BufferedReader(new InputStreamReader(input, "UTF-8"));  
        int x;  
        while ((x = buffer.read(ary)) != -1) {  
                   writer.write(ary, 0, x);  
        }  
        System.out.println(writer.toString());        
        writer.close();  
        buffer.close();  
    }  
	}


