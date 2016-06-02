package com.quickfind.abdi;

public class QuickFind {
	private int objects[];
	QuickFind(int n){
		objects=new int[n];
		for(int i=0;i<n;i++){
			objects[i]=i;
		}
	}
	public boolean connected(int a,int b){
		if(objects[a]==objects[b])
			return true;
		return false;
	}
	public void union(int a,int b){
		int value1=objects[a];
		int value2=objects[b];
		for(int i=0;i<objects.length;i++){
			if(objects[i]==value2){
				objects[i]=value1;
			}
		}
	}
	public void printAll(){
		for(int i=0;i<objects.length;i++){
			System.out.println(objects[i]);
		}
	}
}
