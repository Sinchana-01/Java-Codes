package com.gqt.javacode;

import java.io.File;
import java.io.IOException;

public class Prog1 {
public static void main(String[] args) throws IOException {
	String p1="D:\\AdvJava\\File1.txt";
	File f1=new File(p1);
	f1.createNewFile();
	System.out.println(f1.exists());
	System.out.println(f1.canExecute());
	System.out.println(f1.canRead());
	System.out.println(f1.canWrite());
	System.out.println(f1.getAbsoluteFile());
	System.out.println(f1.getCanonicalPath());
	System.out.println(f1.getFreeSpace());
	System.out.println(f1.getName());
	System.out.println(f1.getParent());
	System.out.println(f1.getPath());
	System.out.println(f1.getTotalSpace());
	System.out.println(f1.getUsableSpace());
	System.out.println(f1.hashCode());
	System.out.println(f1.isAbsolute());
	System.out.println(f1.isDirectory());
	System.out.println(f1.isFile());
	System.out.println(f1.isHidden());
	System.out.println(f1.lastModified());
	System.out.println(f1.length());
	File f2=new File("D:\\AdvJava\\File2.txt");
	System.out.println(f1.renameTo(f2));
System.out.println(f1.getName());
System.out.println(f1.delete());

System.out.println(f1.exists());
}
}
