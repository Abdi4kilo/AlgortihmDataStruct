package com.fixedsizestack.abdi;

public class Test {
	public static void main(String args[]){
		StackFixed a=new StackFixed(10);
		a.push(1);
		a.push(5);
		a.push(7);
		System.out.println(a.pop());
		System.out.println(a.pop());
	}
}
