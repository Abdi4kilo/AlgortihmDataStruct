package com.queuestack.abdi;

public class QueueStack {
	Queue last;
	Queue first;
	public QueueStack() {
		last=null;
		first=null;
	}
	private class Queue{
		String name;
		Queue next;
		Queue(){
			next=null;
		}
	}
	public boolean isEmpty(){
		if(first==null)
			return true;
		return false;
	}
	public void inqueue(String name){
		Queue queue=new Queue();
		queue.name=name;
		if(isEmpty()){
			first=queue;
			last=queue;
		}else{
			last.next=queue;
			last=queue;
		}
	}
	public String dequeue(){
		if(isEmpty())
			return "Empty queue";
		else{
			Queue dequed=first;
			first=first.next;
			return dequed.name;
		}
	}
}
