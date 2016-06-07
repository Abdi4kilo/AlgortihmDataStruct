package com.linkedstack.abdi;

public class LinkedStack {
	private Node first;
	public LinkedStack(){
		first=null;
	}
	private class Node{
		String name;
		Node next;
		Node(){
			this.next=null;
		}
	}
	public boolean isEmpty(){
		if(first==null)
			return true;
		return false;
	}
	public void push(String name){
		Node newNode=new Node();
		newNode.name=name;
		if(isEmpty()){
			first=newNode;
		}else{
			newNode.next=first;
			first=newNode;
		}
	}
	public String pop(){
		if(isEmpty())
			return "Empty stack";
		else{
			String poped=first.name;
			first=first.next;
			return poped;
		}
			
	}
}
