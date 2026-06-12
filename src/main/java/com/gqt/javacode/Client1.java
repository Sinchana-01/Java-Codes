package com.gqt.javacode;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
public static void main(String[] args) throws  IOException {
	Socket csoc= new Socket("192.168.110.38",4000);
	OutputStream os=csoc.getOutputStream();
	DataOutputStream dos=new DataOutputStream(os);
	InputStream is=csoc.getInputStream();
	DataInputStream dis=new DataInputStream(is);
	Scanner d=new Scanner(System.in);
	for (int i=0;i<5;i++) {
	System.out.println("Enter the msg from client");
	String msg=d.nextLine();
	dos.writeUTF(msg);
	System.out.println("---------------");
	String r_msg=dis.readUTF();
	System.out.println(r_msg);
	
	}
}
}
