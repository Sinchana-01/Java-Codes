package com.gqt.javacode;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Prog4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String p1="D://ss.png";
		String p2="D://ss1.png";
		FileInputStream fis=new FileInputStream(p1);
		BufferedInputStream bis=new BufferedInputStream(fis);
		int temp;
		
		FileOutputStream fos=new FileOutputStream(p2);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		while((temp=bis.read())!=-1) {
			bos.write(temp);
		}
		bos.close();
		bis.close();
		fos.close();
		fis.close();

	}

}
