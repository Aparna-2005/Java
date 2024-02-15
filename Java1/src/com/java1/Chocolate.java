package com.java1;

import java.util.Scanner;

public class Chocolate {
	public static void main(String[] args) {
		Scanner array = new Scanner(System.in);
		System.out.println("Enter money : ");
		int money= array.nextInt();
		System.out.println("Enter price of each chocolate : ");
		int chocolateprice= array.nextInt();
		System.out.println("Enter no of wrapper for each chocolate : ");
		int wrapper= array.nextInt();
		int Tot = 0;
		for(int i=1;i<=money;i++) {
			Tot+=chocolateprice;
			if(Tot%wrapper==0) {
				Tot+=1;
			}
		}
		System.out.println("Total Chocolate = "+Tot);
	}
}
