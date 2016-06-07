package com.threesumproblem.abdi;

public class Threesumncubecomplexity {
	
	public void findThreesum(int a[]){
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				for(int k=j+1;k<a.length;k++){
					if(a[i]+a[j]+a[k]==0){
						System.out.println(a[i]+"+"+a[j]+"+"+a[j+1]);
						count++;
					}
				}
				
			}
		}
		System.out.println(count);
	}
}
