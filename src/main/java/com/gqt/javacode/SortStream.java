package com.gqt.javacode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortStream {

	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	Scanner d=new Scanner(System.in);
	System.out.println("Enter the no of elements:");
	int n=d.nextInt();
	for(int i=0;i<n;i++) {
		al.add(d.nextInt());
		}
	System.out.println(al);
	System.out.println("---------------");
	List<Integer> res=al.stream().sorted().collect(Collectors.toList());
System.out.println(res);
	}

}
