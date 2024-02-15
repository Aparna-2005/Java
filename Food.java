package com.Project;

import java.util.Scanner;

public class Food {
	 static String food_name;
     static int food_id;
     static int price;
     static String time;

public void food_items()
{

Scanner sc = new Scanner(System.in);


System.out.println();
System.out.println("-----------------Menu----------------");
System.out.println("1.Breakfast");
System.out.println("2.Lunch");
System.out.println("3.Snack");
System.out.println("4.Dinner");
System.out.println();
System.out.println();


System.out.println("Enter Food preferences : ");
time = sc.nextLine();
System.out.println();

	switch(time){
               case "breakfast":
               {
		    System.out.println("-----------------BREAKFAST ITEMS------------------------");
		    food_name = "idly";
                      food_id=1;
                      price = 7;
                      System.out.println("Food name : " +food_name);
                  System.out.println("Food id : " +food_id);
                      System.out.println("Price : " +price);
	            System.out.println();
	            System.out.println("----------------------------------------------");
	            System.out.println();

		    food_name = "poori";
                      food_id=2;
                      price = 30;
                      System.out.println("Food name : " +food_name);
                  System.out.println("Food id : " +food_id);
                      System.out.println("Price : " +price);
	            System.out.println();
	            System.out.println("----------------------------------------------");
	            System.out.println();

		    food_name = "pongal";
                       food_id=3;
                       price = 30;
                       System.out.println("Food name : " +food_name);
                   System.out.println("Food id : " +food_id);
                       System.out.println("Price : " +price);
	            System.out.println();
	            System.out.println("----------------------------------------------");
	            System.out.println();

		    food_name = "dosa";
                      food_id=4;
                      price = 25;
                      System.out.println("Food name : " +food_name);
                  System.out.println("Food id : " +food_id);
                      System.out.println("Price : " +price);

                    break;
              }

               case "lunch":
               {
            	   System.out.println();         	
		    System.out.println("-----------------LUNCH ITEMS------------------------");
		    food_name = "biriyani" ;
                      food_id=1;
                      price = 80;
                      System.out.println("Food name : " +food_name);
                  System.out.println("Food id : " +food_id);
                      System.out.println("Price : " +price);
	            System.out.println();
	            System.out.println("----------------------------------------------");
	            System.out.println();
                      	
		   food_name = "meals";
                     food_id=2;
                     price = 120;
                     System.out.println("Food name : " +food_name);
                 System.out.println("Food id : " +food_id);
                     System.out.println("Price : " +price);
	           System.out.println();
	           System.out.println("----------------------------------------------");
	           System.out.println();
                      	
		   food_name = "sambar rice";
                     food_id=3;
                     price = 70;
                     System.out.println("Food name : " +food_name);
                 System.out.println("Food id : " +food_id);
                     System.out.println("Price : " +price);
	           System.out.println();
	           System.out.println("----------------------------------------------");
	           System.out.println();
                    	
		  food_name = "lemon rice";
                    food_id=1;
                    price = 50;
                    System.out.println("Food name : " +food_name);
                System.out.println("Food id : " +food_id);
                    System.out.println("Price : " +price);
	          System.out.println();
	          System.out.println("----------------------------------------------");
	          System.out.println();
                  
                  break;
                 }


               case "snack":
               {
            	   System.out.println();
            	   System.out.println();
		    System.out.println("-----------------SNACK ITEMS------------------------");
		    food_name = "french fries";
                      food_id=1;
                      price = 30;
                      System.out.println("Food name : " +food_name);
                  System.out.println("Food id : " +food_id);
                      System.out.println("Price : " +price);
	            System.out.println();
	            System.out.println("----------------------------------------------");
	            System.out.println();
                      	
		   food_name = "bread omblet" ;
                     food_id=2;
                     price = 20;
                     System.out.println("Food name : " +food_name);
                 System.out.println("Food id : " +food_id);
                     System.out.println("Price : " +price);
	           System.out.println();
	           System.out.println("----------------------------------------------");
	           System.out.println();
                      	
		   food_name = "samosa";
                     food_id=3;
                     price = 20;
                     System.out.println("Food name : " +food_name);
                 System.out.println("Food id : " +food_id);
                     System.out.println("Price : " +price);
	           System.out.println();
	           System.out.println("----------------------------------------------");
	           System.out.println();
                     	
		  food_name = "sandwich";
                    food_id=4;
                    price = 30;
                    System.out.println("Food name : " +food_name);
                System.out.println("Food id : " +food_id);
                    System.out.println("Price : " +price);
	          System.out.println();
	          System.out.println("----------------------------------------------");
	          System.out.println();
                    	
                          break;
               }
               case "dinner":
               {
            	   System.out.println();
            	   System.out.println();
		    System.out.println("-----------------DINNER ITEMS------------------------");
		    System.out.println();
		    
		    
		    food_name = "idly";
                      food_id=1;
                      price = 7;
                      System.out.println("Food name : " +food_name);
                  System.out.println("Food id : " +food_id);
                      System.out.println("Price : " +price);
	            System.out.println();
	            System.out.println("----------------------------------------------");
	            System.out.println();
                     	
		   food_name = "chappathi";
                     food_id=2;
                     price = 10;
                     System.out.println("Food name : " +food_name);
                 System.out.println("Food id : " +food_id);
                     System.out.println("Price : " +price);
	           System.out.println();
	           System.out.println("----------------------------------------------");
	           System.out.println();

		   food_name = "dosa";
                     food_id=3;
                     price = 25;
                     System.out.println("Food name : " +food_name);
                 System.out.println("Food id : " +food_id);
                     System.out.println("Price : " +price);
	           System.out.println();
	           System.out.println("----------------------------------------------");
	           System.out.println();

		   food_name = "parotta";
                     food_id=4;
                     price = 30;
                     System.out.println("Food name : " +food_name);
                 System.out.println("Food id : " +food_id);
                     System.out.println("Price : " +price);
	           System.out.println();
	           System.out.println("----------------------------------------------");
	           System.out.println();
                    }
                          break;
   
     }
}
}
