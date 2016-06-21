package com.selectionsort.abdi;

public class Selection {
	int a[];
	
	public void sort(int b[]){
			a=b;
		for(int i=0;i<a.length;i++){
			int min=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[min]){
					min=j;
				}
			}
			swap(i,min);
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
