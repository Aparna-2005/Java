package com.java1;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	int i;
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n=sc.nextInt();
		int num[]=new int[100];
		for(i=0; i<n;i++) {
			System.out.println("Enter array elements : ");
			num[i]=sc.nextInt();
		}
		System.out.println("Array elements are : " );
		for(i=0;i<n;i++) {
			System.out.println(num[i]);
		}
		int max=num[0];
		System.out.println("Larget number is : ");
		for(i=0;i<n;i++) {
			if(num[i]>max) {
				max=num[i];
				
			}
		}
		System.out.println(max);
		
		int min=num[0];
		System.out.println("Smallest  number is : ");
		for(i=0;i<n;i++) {
			if(num[i]<min) {
				min=num[i];
				
			}
		}
		System.out.println(min);
		sc.close();
	}
}

