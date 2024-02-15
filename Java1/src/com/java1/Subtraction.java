package com.java1;


// class B 
public class Subtraction extends  Multiplication {
   int a=5, b=10;
   public void sub() {
	   Subtraction sub= new Subtraction();
	   int c= (sub.b) - (sub.a);
	   System.out.println("Sub : " +c);
   }
}
