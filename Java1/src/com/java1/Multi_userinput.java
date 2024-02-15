package com.java1;

import java.util.Scanner;

public class Multi_userinput {
public static void main(String[] args) {
	int i,j;
	int arr1[][]=new int[100][100];
	Scanner mul = new Scanner(System.in);
	System.out.println("Enter row size : ");
	int n=mul.nextInt();
	System.out.println("Enter column size : ");
	int m=mul.nextInt();
	System.out.println("Enter array elements");
	for(i=0;i<n;i++) {
		for(j=0;j<m;j++) {
			
			arr1[i][j]=mul.nextInt();
		}
	}
	System.out.println("Array elements are : ");
	for(i=0;i<n;i++) {
		for(j=0;j<m;j++) {
			System.out.print(arr1[i][j]+ " ");
		}
		System.out.println();
	}
}
}
