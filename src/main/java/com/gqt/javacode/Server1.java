package com.gqt.javacode;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

	public static void main(String[] args) throws IOException {
	
		ServerSocket listener=new ServerSocket(4000);
		System.out.println("Server is ready to accept");
		Socket ssoc=listener.accept();
		InputStream is=ssoc.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		OutputStream os=ssoc.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		Scanner d=new Scanner(System.in);
		for (int i=0;i<5;i++) {
		String msg=dis.readUTF();
		System.out.println(msg);
		System.out.println("Enter the response from server");
		String r_msg=d.nextLine();
		dos.writeUTF(r_msg);
		
	}}

}
