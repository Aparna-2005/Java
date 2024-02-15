package com.java1;

import java.util.Scanner;

public class Merge_array {
	public static void main(String[] args) {
		Scanner array = new Scanner(System.in);
		int a[] = new int[100];
		System.out.println("Enter size of first array");
		int n= array.nextInt();
		System.out.println("enter array elements :");
		for(int i=0;i<n;i++) {
			a[i]=array.nextInt();
		}
		
		int b[] = new int[100];
		System.out.println("Enter size of second  array");
		int m= array.nextInt();
		System.out.println("enter array elements :");
		for(int i=0;i<m;i++) {
			b[i]=array.nextInt();
		}
		System.out.println("First array elements : ");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Second array elements : ");
		for(int i=0;i<m;i++) {
			System.out.println(b[i]);
		}
		
		
		int c[] = new int[100];

		for( int i=0;i<n;i++) {
			c[i]=a[i];
		}
		for( int i=0;i<m;i++) {
			c[i+n]=b[i];
		}
		System.out.println("Merged array : ");
		for(int i=0;i<n+m;i++) {
			System.out.println(c[i]);
		}
	}
	

	
}
