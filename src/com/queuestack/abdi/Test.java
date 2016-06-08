package com.queuestack.abdi;

public class Test {
	public static void main(String args[]){
		QueueStack a=new QueueStack();
		a.inqueue("Abdi");
		a.inqueue("Biru");
		a.inqueue("Worku");
		System.out.println(a.dequeue());
		System.out.println(a.dequeue());
		System.out.println(a.dequeue());
		System.out.println(a.dequeue());
	}
}
