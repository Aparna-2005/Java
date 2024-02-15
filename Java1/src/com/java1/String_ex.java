package com.java1;

import java.util.Scanner;

public class String_ex {
public static void main(String[] args) {
	Scanner name= new Scanner(System.in);
	String name1 = new String();
	System.out.println("Enter your name : ");
	name1=name.nextLine();
	System.out.println("String as character : ");
	for(int i=0;i<name1.length();i++) {
		System.out.println(name1.charAt(i));
		
	}
}
}
