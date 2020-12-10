package com.files;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class charArrayWriterEx {
	public static void main(String args[])throws Exception{    
        CharArrayWriter out=new CharArrayWriter();    
        out.write("MRITYUNJAY");    
        FileWriter f1=new FileWriter("E:\\name1.txt");    
        FileWriter f2=new FileWriter("E:\\name2.txt");    
            
        out.writeTo(f1);    
        out.writeTo(f2);    
          
        f1.close();    
        f2.close();    
        
        System.out.println("Success...");    
       }    
      }    
