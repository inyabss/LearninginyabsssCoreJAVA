package com.Java.Arrays;

public class Print_Array {

	public static void main(String[] args){
		int [] arr1;
		int arr2[];
		int[]arr3=new int[5];
		int []arr4=new int[]{1,2,3};
		int len=arr4.length;
		System.out.println("Length of Arr4 is:"+" "+len);
		//Print Array 4
		for(int i=0;i<len;i++) {
			System.out.println(arr4[i]);
		}
		//Print Array 3[Array not initialized. By default will have "0" values
		for(int i=0;i<5;i++) {
			System.out.println(arr3[i]);
		}
		

		
		
		
		
		
		
		
	}

}
