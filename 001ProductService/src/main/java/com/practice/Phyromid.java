package com.practice;

public class Phyromid {
	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++)
		{
			for(int k=0;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=n-i;j<=n;j++)
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}
