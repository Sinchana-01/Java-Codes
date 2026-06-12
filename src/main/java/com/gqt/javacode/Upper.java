package com.gqt.javacode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Upper {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	Scanner d=new Scanner(System.in);
	System.out.println("Enter the no of elements:");
	int n=d.nextInt();
	for(int i=0;i<n;i++) {
		al.add(d.next());
		}
	System.out.println(al);
	System.out.println("---------------");
	ArrayList<String> res=new ArrayList<String>();
	for(int i=0;i<n;i++)
	{
		
			res.add(al.get(i).toUpperCase());
			
		
	}
System.out.println("resultant="+res);
	}

}
