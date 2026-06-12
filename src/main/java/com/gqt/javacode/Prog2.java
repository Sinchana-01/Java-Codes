package com.gqt.javacode;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) throws IOException {
		String p1="D:\\AdvJava\\File1.txt";
		FileWriter fw=new FileWriter(p1);
		fw.write("Hello! Welcome"); 
		fw.close();
		System.out.println("Reading from file");
		FileReader fr=new FileReader(p1);
		Scanner sc=new Scanner(fr);
		while(sc.hasNextLine()) {
			String t=sc.next();
			System.out.print(t);
		
		}
		sc.close();
		fr.close();
	}

}
