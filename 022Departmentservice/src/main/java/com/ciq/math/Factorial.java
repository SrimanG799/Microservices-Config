package com.ciq.math;

public class Factorial {
	
	public static void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
		
	}
	
	
	public static void wfact(int n)
	{
		int fact=1;
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
	
	
public static void main(String[] args) {
	fact(5);
	wfact(5);
}
}
