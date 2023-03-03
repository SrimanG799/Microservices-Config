package com.practice;

public class LeapYear {
	

public static void isleap(int year)
{
	
	if((year%4==0)&&(year%100!=0||year%400==0))
			{
		System.out.println(year+" is leap year");
		
		
			}
	else {
		System.out.println(year+" is not leap");
		
		
	}
}
public static void main(String[] args) {
	isleap(2004);
	isleap(1992);
	isleap(400);
}
	

}
