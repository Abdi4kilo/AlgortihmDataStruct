package com.insertionsort.abdi;

public class Insertion {
	int b[];
	public void sort(int a[]){
		b=a;
		for(int i=0;i<a.length;i++){
			for(int j=i;j>0;j--){
				if(a[j-1]>a[j]){
					swap(j-1,j);
				}else{
					break;
				}
			}
		}
		print();
	}
	private void print() {
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
	void swap(int i,int min){
		int temp=b[i];
		b[i]=b[min];
		b[min]=temp;
	}
}
