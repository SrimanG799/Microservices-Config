package com.practice;

public class PerfectSqure {
	
	public static void main(String[] args) {
		int num=25;
		double sr= Math.sqrt(num);
		System.out.println(sr);
		int n=(int) Math.floor(sr);
		int s=(int) Math.pow(n, 2);
		if(s==num)
		{
			System.out.println(num+"is perfect square");
		}
		else {
			System.out.println(num+" is not perfect square");
		}
		
		
	}

}
