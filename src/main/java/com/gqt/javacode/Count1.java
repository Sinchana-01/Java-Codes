package com.gqt.javacode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Count1 {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	Scanner d=new Scanner(System.in);
	System.out.println("Enter the no of elements:");
	int n=d.nextInt();
	int c=0;
	for(int i=0;i<n;i++) {
		al.add(d.next());
		}
	System.out.println(al);
	System.out.println("---------------");
	
	for(int i=0;i<n;i++)
	{
		if(al.get(i).length()==5)
			c++;
			
		
	}
System.out.println("resultant count="+c);
	}

}

