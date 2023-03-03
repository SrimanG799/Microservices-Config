package com.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateJava {
public DateJava(SimpleDateFormat format) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	System.out.println(java.time.LocalDate.now());
	
	System.out.println(java.time.Clock.systemUTC().instant());
	
	
	 java.util.Date date = new java.util.Date();    
	    System.out.println(date);  
	    
	    SimpleDateFormat format=new SimpleDateFormat("05/05/2023");



	   
	   
       String pattern = "04-10-1995";
	   SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	   String date2 = simpleDateFormat.format(new Date());
	   System.out.println(date2);
}
}
