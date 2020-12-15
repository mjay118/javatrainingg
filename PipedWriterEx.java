package com.files;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriterEx {
	public static void main(String[] args) throws IOException {
		PipedWriter pw=new PipedWriter();
		PipedReader pr=new PipedReader();
		String s="MRITYUNJAY";
		pw.connect(pr);
		pw.write(s);
		int i=pr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=pr.read();
		}
		pw.close();
		pr.close();
	}
}
