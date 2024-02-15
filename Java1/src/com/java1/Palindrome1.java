package com.java1;

public class Palindrome1 {
	public static void main(String[] args) {
		int a=555;
		int res=0;
		int temp=a;
		while(a>0){
			int rem=a%10; // find remainder for the given number 
			res=(res*10)+rem; //  multiply with 10 and add them with rem
			a=a/10; // divide  by 10
			
		}
		System.out.println(res);
		if(res==temp) {
			System.out.println("palindome");
		}
		
		else {
			System.out.println("not a palindome");
		}
	}
}

/* given number num=123
      1. find remainder 123 % 10 ===>  rem = 3
      2. initializ sum = 0, multiply 10 with sum ana add that with rem  ===>   0+3=3 (it will be first printed)
      3. divide given number by 10   ===>  123/10 = 12  
      4. step 1 will continue, it take result of step 3  as given number until given number gets 0   
 * */
