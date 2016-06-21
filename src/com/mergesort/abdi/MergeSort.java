package com.mergesort.abdi;

import java.util.Arrays;

public class MergeSort {

	public int[] splitSort(int array[]){
		int arrayLength=array.length;
		int high=arrayLength-1;
		int low=0;
		if(arrayLength==1)
			return array;
		int mid=(high+low)/2;
		int left[]=new int[mid+1];
		int right[]=new int[(high-mid)];
		for(int i=0;i<left.length;i++){
			left[i]=array[i];
		}
		int i=0;
		for(int j=mid+1;j<array.length;j++){
			right[i]=array[j];
			i++;
		}
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		int a[]=splitSort(left);
		int b[]=splitSort(right);
		int c[]=merge(a, b);
		return c;
	}
	public int[] merge(int left[],int right[]){
		// Pre condition has to be sorted
		int rightLength=right.length;
		int leftLength=left.length;
		int mergedArrayLength=right.length+left.length;
		int mergedArray[]=new int[mergedArrayLength];
		int i=0;
		int j=0;
		int k=0;
		while(i<leftLength && j<rightLength){
			if(left[i]<right[j]){
				mergedArray[k]=left[i];
				i++;
			}else{
				mergedArray[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<leftLength){
			mergedArray[k]=left[i];
			i++;
			k++;
		}
		while(j<rightLength){
			mergedArray[k]=right[j];
			j++;
			k++;
		}
		
		return mergedArray;
	}
}
