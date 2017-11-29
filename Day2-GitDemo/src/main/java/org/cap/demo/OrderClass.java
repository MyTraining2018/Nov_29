package org.cap.demo;

public class OrderClass {
	int[] arr={1,23,45,-90,12};
	
	public void display(){
		int sum=0;
		for(int n:arr){
			System.out.println(n);
			sum=sum+n;
		}
			System.out.println("Summation: " + sum);
			System.out.println("Completed!");
	}
	
	public void show(){
		System.out.println("Show Method");
	}

}
