package com.Project;

import java.util.Scanner;

public class Customer_details extends Food {
	static String name;
	static int id;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name : ");
    name = sc.nextLine();
    System.out.println("Enter id : ");
    id = sc.nextInt();
    System.out.println();
    System.out.println("                               Welcome to the Maha hotel  "  +name.toUpperCase()+ "!!!!!");

   System.out.println();
   Customer_details obj = new Customer_details();
   obj.food_items();
   Order obj2= new Order();
   obj2.bill_calc();
}
}
