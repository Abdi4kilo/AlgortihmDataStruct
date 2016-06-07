package com.linkedstack.abdi;

public class Test {
	public static void main(String args[]){
		LinkedStack a=new LinkedStack();
		a.push("Abdi");
		a.push("Biru");
		a.push("Worku");
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		
		System.out.println(a.pop());
	}
}
