package com.Java.Arrays;

public class OddEvenNumber {

	public static void main(String[] args) {
		int []arr4={1,2,3,4,5};
		int len=arr4.length;
		System.out.println("Length of Arr4 is:"+" "+len);
		for(int i=0;i<len;i++)
		{
			if(arr4[i]%2==0)
			{
				System.out.println(arr4[i]+"is Even number at Index:"+i);
			}
			else 
			{
				System.out.println(arr4[i]+"is Odd number at Index:"+i);
			}
		}

	}

}
