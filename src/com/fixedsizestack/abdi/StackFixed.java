package com.fixedsizestack.abdi;

public class StackFixed {
	int index;
	int stack[];
	public StackFixed(int size) {
		stack=new int[size];
		index=0;
	}
	public void push(int a){
		stack[index++]=a;
	}
	public int pop(){
		return stack[--index];
	}
}
