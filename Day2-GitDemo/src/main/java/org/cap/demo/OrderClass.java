package org.cap.demo;

public class OrderClass {
	int[] arr={1,23,45,-90,12};
	
	public void display(){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("Sum = " +sum);
	}
	
	public void show(){
		System.out.println("Show Method");
	}

}
