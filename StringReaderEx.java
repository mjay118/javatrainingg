package com.files;

import java.io.StringReader;

public class StringReaderEx {
	public static void main(String[] args) throws Exception {  
        String srg = "Hello, MRITYUNJAY here";  
        StringReader reader = new StringReader(srg);  
        int k=0;  
            while((k=reader.read())!=-1){  
                System.out.print((char)k);  
            }  
        }  
}
