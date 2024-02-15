package com.java1;

// class A
public class Addition extends Subtraction {
public void add() {
	System.out.println("Add : " +(a+b));
}
public static void main(String[] args) {
	Addition obj = new Addition();
	obj.add();
	obj.sub();
	obj.mul();
}
}
