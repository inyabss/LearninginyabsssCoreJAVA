package com.Java.Arrays;

public class OddEvenIndex {

	public static void main(String[] args) {
		//int sum=0;
		int []arr4={1,2,3,4,5,6,7,8,9,10};
		int len=arr4.length;
		System.out.println("Length of Arr4 is:"+" "+len);
		for(int i=0;i<len;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"is Even indexed and the value is:"+arr4[i]);
			}
			else 
			{
				System.out.println(i+"is ODD indexed and the value is:"+arr4[i]);
			}
		}
		
	}

}
