package com.mergesort.abdi;

import java.util.Arrays;

public class Test {
	public static void main(String args[]){
		MergeSort obj=new MergeSort();
		int left[]={7,5,0,32,11,2,8,9,45,3,88};
		System.out.println(Arrays.toString(obj.splitSort(left)));
		
	}
}
