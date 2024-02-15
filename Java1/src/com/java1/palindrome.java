package com.java1;

public class palindrome {
public static void main(String[] args) {
	int a=123,n=0;
	int res=0;
	while(a>0){
		int rem=n%10;
		res=(res+10)*rem;
		n=n/10;
	}
	System.out.println(res);
}
}
