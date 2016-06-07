package com.binarysearch.abdi;

public class Binary {
	public int BinarySearch(int a[],int num){
		int low=0;
		int high=a.length-1;
		while(low<=high){
			int middle=high+low/2;
			if(a[middle]==num){
				return middle;
			}else if(num<a[middle]){
				 high=middle-1;
			}else if(num>a[middle]){
				low=middle+1;
			}
		}
		return -1;
	}
}
