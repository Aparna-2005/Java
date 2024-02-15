package com.Project;

import java.util.Scanner;

public class Order 
{
	static String food;
	static int n;
	public static void bill_calc()
	{
		Food obj = new Food();
		
		Customer_details cus = new Customer_details();
		 
		
	        Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of the food : ");
	        food=scan.nextLine();
		System.out.println("Enter no.of food items: ");
	       n=scan.nextInt();
	       System.out.println();
	       System.out.println();
	       System.out.println("Name of the customer : " +cus.name);
	       System.out.println("Customer id : " +cus.id);
		System.out.println("Ordered  time : "  +obj.time);
		System.out.println("Ordered food : " +food);
        if(food.equals("idly")) {	
        	System.out.println("Bill amount : " +(7*n));
        }
        else if(food.equals("dosa")) {
        	System.out.println("Bill amount : " +(25*n));
        }
        else if(food.equals("poori")) {
        	System.out.println("Bill amount : " +(30*n));
        }
        else if(food.equals("pongal")) {
        	System.out.println("Bill amount : " +(30*n));
        }
        else if(food.equals("chappathi")) {
        	System.out.println("Bill amount : " +(10*n));
        }
        else if(food.equals("meals")) {
        	System.out.println("Bill amount : " +(120*n));
        }
        else if(food.equals("sambar")) {
        	System.out.println("Bill amount : " +(70*n));
        }
        else if(food.equals("biriyani")) {
        	System.out.println("Bill amount : " +(50*n));
        }
        else if(food.equals("lemon rice")) {
        	System.out.println("Bill amount : " +(7*n));
        }
        else if(food.equals("sandwich")) {
        	System.out.println("Bill amount : " +(30*n));
        }
        else if(food.equals("samosa")) {
        	System.out.println("Bill amount : " +(20*n));
        }
        else if(food.equals("french fries")) {
        	System.out.println("Bill amount : " +(30*n));
        }
        else if(food.equals("bread omblet")) {
        	System.out.println("Bill amount : " +(20*n));
        }
        else if(food.equals("parotta")) {
        	System.out.println("Bill amount : " +(30*n));
        }
	
	
	}
}


