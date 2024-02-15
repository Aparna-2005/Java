package com.java1;

public class Variable {
//	   int  num=5;
	 static int n=5;
	
	
	public static void main(String args[]) {
		
//		 increment and decrement operator
		 int c=10;
		 int a=5;
		 
		 System.out.println(c++);
		 System.out.println(c);
		 System.out.println(++c);
		 System.out.println(c);
		 
		 System.out.println(a--);
		 System.out.println(a);
		 System.out.println(--a);
		 System.out.println(a);
		 
		 
//		 Global variable -- java cannot support global variable bcoz it is a OOP concept, so everything needs to be a part of class. The reason is to protect data and members(variables and methods) of the class
		 
//		 System.out.println(num);
		 System.out.println(n);
	}

}
