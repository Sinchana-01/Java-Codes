package com.gqt.javacode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling3 {

	public static void main(String[] args) throws IOException {
		
		String p1="D://ss.png";
		String p2="D://ss2.png";
		FileReader fr=new FileReader(p1);
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter(p2);
		BufferedWriter bw=new BufferedWriter(fw);
		int temp;
		while((temp=br.read())!=-1) {
			bw.write(temp);
		}
		bw.close();
		br.close();
		fw.close();
		fr.close();

	}

}
