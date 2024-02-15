package com.java1;

import java.util.Scanner;

public class Star_pattern1 {
public static void main(String[] args) {
	Scanner array = new Scanner(System.in);
	System.out.println("Enter no of lines to be printed : ");
	int n= array.nextInt();
	
	
	
	System.out.println("Right star pattern");
	for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	System.out.println("Right star Decrement pattern");
	 	    for(int i=0;i<n;i++)
	 	    {
	 	      for(int j=i;j<n;j++)
	 	      {
	 	        System.out.print("* ");
	      }
	       System.out.println();
	     }
	
	System.out.println("Pyramid  pattern");
	for(int i=0;i<n;i++) {
		for(int j=i;j<=n;j++) {
			System.out.print(" ");
		}
		for(int j=0;j<i;j++) {
			System.out.print("* ");
		}
		for(int j=0;j<=i;j++) {
			System.out.print(" ");
		}
		System.out.println();
	}
	
	
	
	System.out.println("Left star pattern");
	for(int i=1;i<=n;i++)
	 {
	   for(int j=i;j<=n;j++)
	         {
	           System.out.print(" ");
	         }
	     for(int j=1;j<=i;j++)
	     {
	         System.out.print("*");
	         }
	        
	         System.out.println();
	     }
	
	
	System.out.println("Left star decrement pattern");
	for(int i=0;i<n;i++)
	 {
	   for(int j=1;j<=i;j++)
	         {
	           System.out.print(" ");
	         }
	     for(int j=i;j<n;j++)
	     {
	         System.out.print("*");
	         }
	        
	         System.out.println();
	     }

	
	System.out.println("Number pattern");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+ " ");
		}
		System.out.println();
	}
	
	
	
}
}
