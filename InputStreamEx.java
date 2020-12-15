package com.files;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class InputStreamEx {
	public static void main(String args[])throws Exception{    
		   FileInputStream input1=new FileInputStream("E:\\writer.txt");    
		   FileInputStream input2=new FileInputStream("E:\\bufferedWriter.txt");    
		   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
		   int j;    
		   while((j=inst.read())!=-1){    
		    System.out.print((char)j);    
		   }    
		   inst.close();    
		   input1.close();    
		   input2.close();    
		  }    
		}    

