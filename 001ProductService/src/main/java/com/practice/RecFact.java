package com.practice;

public class RecFact {
	public static int factRec(int num)
	{
		
		if(num==1)
		{
			return 1;
		}
		else
		{
			return num*factRec(num-1);
			
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println(factRec(5));
	}

}
