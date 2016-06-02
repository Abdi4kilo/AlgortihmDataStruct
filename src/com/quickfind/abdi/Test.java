package com.quickfind.abdi;

public class Test {
	public static void main(String args[]){
		QuickFind obj=new QuickFind(10);
		obj.union(1,2);
		obj.union(2,3);
		obj.union(7,3);
		obj.union(4, 8);
		obj.printAll();
		System.out.println(obj.connected(1, 7));
	}
}
