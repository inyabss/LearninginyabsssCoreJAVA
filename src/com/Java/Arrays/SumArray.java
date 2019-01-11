package com.Java.Arrays;

public class SumArray {

	public static void main(String[] args) {
		
		int sum=0;
		int []arr4=new int[]{1,2,3,4};
		int len=arr4.length;
		System.out.println("Length of Arr4 is:"+" "+len);
		//Print Sum of Array 4
		for(int i=0;i<len;i++) {
			sum+=arr4[i];
		}
		System.out.println("Sum of the elements in Array4 is:"+sum);

	}

}
