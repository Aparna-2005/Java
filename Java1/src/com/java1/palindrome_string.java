package com.java1;

import java.util.Scanner;

public class palindrome_string {
public static void main(String[] args) {
	Scanner name= new Scanner(System.in);
	String name1 = new String();
	System.out.println("Enter your name : ");
	name1=name.nextLine();
	System.out.println("Reverse order : ");
	int n=name1.length();
	String rev="";
	for(int i=n-1;i>=0;i--) {
		rev = rev + name1.charAt(i);
	}
	System.out.println(rev);
	if(name1.equals(rev)) {
		System.out.println(name1+ " is palindrome");
	}
	else {
		System.out.println(name1+ " is not a palindrome");
	}
}
}
