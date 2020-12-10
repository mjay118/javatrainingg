package com.files;

import java.io.CharArrayReader;

public class CharArrayReaderEx {
	 public static void main(String[] ag) throws Exception {  
		    char[] ary = { 'M', 'R', 'I', 'T', 'Y', 'U', 'N', 'J', 'A', 'Y' };  
		    CharArrayReader reader = new CharArrayReader(ary);  
		    int k = 0;  
		    // Read until the end of a file  
		    while ((k = reader.read()) != -1) {  
		      char ch = (char) k;  
		      System.out.print(ch + " : ");  
		      System.out.println(k);  
		    }  
		  }  
		}  

