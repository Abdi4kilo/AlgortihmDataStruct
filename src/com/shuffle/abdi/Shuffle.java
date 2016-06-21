package com.shuffle.abdi;

public class Shuffle {
	int a[];
	public void shuffle(int b[]){
		a=b;
		for(int i=0;i<a.length;i++){
			int rand=(int)(Math.random()*i);
			swap(i,rand);
		}
		print();
	}
	private void print() {
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}
	void swap(int i,int min){
		int temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	}
}
