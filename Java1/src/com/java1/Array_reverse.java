package com.java1;

import java.util.Scanner;

public class Array_reverse {
public static void main(String[] args) {
	Scanner array = new Scanner(System.in);
	int a[] = new int[100];
	System.out.println("Enter size of first array");
	int n= array.nextInt();
	System.out.println("enter array elements :");
	for(int i=0;i<n;i++) {
		a[i]=array.nextInt();
	}
	
	System.out.println("First array elements : ");
	for(int i=0;i<n;i++) {
		System.out.println(a[i]);
	}
	System.out.println("Array elements in reverse order : ");
	for(int i=n-1;i>=0;i--) {
		System.out.println(a[i]);
	}
}
}
