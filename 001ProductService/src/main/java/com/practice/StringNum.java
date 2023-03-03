package com.practice;

public class StringNum {
	public static void main(String[] args) {
		
		String s1="srimman45shan35mahi7ravi77";
		char[] ch=s1.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			
			if(0<=ch[i]&&ch[i]>=9)
			{
				sum=sum+ch[i];
			}
		}
		System.out.println(sum);
		
	}
	

}
