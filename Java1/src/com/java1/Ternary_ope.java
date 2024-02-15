package com.java1;

public class Ternary_ope {
 public static void main(String args[]) {
	   int a=50, b=6000, c=10;
//	   String res = (a>b ? (a>c ? "A is greatest" : "B is greatest") : (b>c ? "B is greatest" : "C is greatest"))  ;
//	   System.out.println(res);
	   if((a>b)) {
		   if((a>c)) {
			   System.out.println("A is greatest");
		   }
	   }
	   else {
		   if(b>c) {
			   System.out.println("B is greatest");
		   }
		   else {
			   System.out.println("C is greatest");
		   }
	   }
	   
	  
 }
}
