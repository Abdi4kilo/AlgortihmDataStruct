package com.quickunion.abdi;

public class QuickUnion {
	private int nums[];
	QuickUnion(int n){
		nums=new int[n];
		for(int i=0;i<nums.length;i++){
			nums[i]=i;
		}
	}
	private int root(int i){
		while(i!=nums[i]){
			i=nums[i];
		}
		return i;
	}
	public void union(int a,int b){
		int roota=root(a);
		int rootb=root(b);
		nums[roota]=rootb;
	}
	public boolean connected(int a,int b){
		if(root(a)==root(b)){
			return true;
		}
		return false;
	}
	public void print(){
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
}
