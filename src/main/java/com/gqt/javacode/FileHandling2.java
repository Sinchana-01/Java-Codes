package com.gqt.javacode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 {

	public static void main(String[] args) throws IOException {
		
		String p1="D:\\Input1.txt";
		String p2="D:\\Output1.txt";
		FileReader fr=new FileReader(p1);
		FileWriter fw=new FileWriter(p2);
		int temp;
		while((temp=fr.read())!=-1) {
			fw.write(temp);
		}
		fw.close();
		fr.close();

	}

}
