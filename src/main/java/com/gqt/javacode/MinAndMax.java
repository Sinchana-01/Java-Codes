package com.gqt.javacode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MinAndMax {

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
	String min=al.stream().min((s1,s2) ->s1.compareTo(s2)).get();
System.out.println("Min:"+min);
String max=al.stream().max((s1,s2) ->s1.compareTo(s2)).get();
System.out.println("Max:"+max);
	}

}
