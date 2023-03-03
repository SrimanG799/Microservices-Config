package com.practice;

public class FebRec {
public static int a1=0,a2=1,a3=0;

	
	public  void printFibo(int count)
	{
	//System.out.println(a1);
		if(count >0)
		{
			a3=a1+a2;
			a1=a2;
			a2=a3;
			System.out.println(a1);
			printFibo(count-1);
		}
		
	}
	
public static void main(String[] args) {
	System.out.println();
FebRec f=new FebRec();
f.printFibo(10);
	
}
}
