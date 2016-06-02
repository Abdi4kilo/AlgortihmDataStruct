package com.quickunion.abdi;

public class Test {
	public static void main(String args[]){
		QuickUnion a=new QuickUnion(10);
		a.union(3,4);
		a.union(1, 2);
		a.union(6, 4);
		a.union(4, 5);
		System.out.println("Program output "+ a.connected(5, 3)+" Expected output true");
		a.print();
		
	}
}
