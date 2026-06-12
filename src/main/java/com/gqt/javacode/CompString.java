package com.gqt.javacode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CompString {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
	Scanner d=new Scanner(System.in);
	System.out.println("Enter the no of elements:");
	int n=d.nextInt();
	for(int i=0;i<n;i++) {
		al.add(d.nextLine());
		}
	System.out.println(al);
	System.out.println("---------------");
	List<String> list=al.stream().sorted((s1,s2) ->s1.compareTo(s2)).collect(Collectors.toList());
System.out.println(list);
	}

}
