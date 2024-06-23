// package com.Assignment.Amdocs;

import java.util.Scanner;

public class Assignment1 {
	public static boolean leapYear(int year) {
		if(year%4==0 && (year%400==0 || year%100!=0)){
			return true;
		}
		return false;
	}
	public static boolean validDate(int date,int month,int year) {
		if(month>12 || month<0 )
			return false;
		else {
		   int arr[]=new int [12];
		   for(int i=0;i<12;i++) {
			   switch(i) {
				   case 0:case 2:case 4:case 6:case 7:case 9:case 11:
					    arr[i]=31;
					    break;
				   case 3:case 5:case 8:case 10:
					   arr[i]=30;
					   break;
				   case 1:
					   if(leapYear(year))
						   arr[i]=29;
					   else
						   arr[i]=28;
					 default:
						 System.out.println(" ");
				  
			   }
		   }
		   if(date<=arr[month-1] && date >0)
			   return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the date in [DD-MM-YYYY] format:");
		String date1=sc.nextLine();
		String arr1[]=date1.split("-");
		int day=Integer.parseInt(arr1[0]);
		int month=Integer.parseInt(arr1[1]);
		int year=Integer.parseInt(arr1[2]);
//		System.out.println(day+" "+((Object)day).getClass().getSimpleName());
		boolean valid=validDate(day,month,year);
		System.out.println("The output is"+valid);
		System.out.println(leapYear(year));
	}

}
