package com.training.mars;

import java.util.Scanner;

public class Days {

	public static void main(String[] strings) {
		Scanner scanner = new Scanner(System.in);
		
		int no_of_Days = 0;
		String Month = "Unknown";
		
		System.out.print("Enter a month number:");
		int month = scanner.nextInt();
		
		System.out.print("Enter a year:");
		int year = scanner.nextInt();
		
		switch(month) {
		case 1:
			Month = "January";
			no_of_Days = 31;
			break;
		case 2:
			Month = "February";
			if((year % 400 ==0)) {
				no_of_Days = 29;
			}else {
				no_of_Days = 28;
			}
		   break;
		case 3:
			Month = "March";
			no_of_Days = 31;
			break;
		case 4:
			Month = "April";
			no_of_Days = 30;
			break;
		case 5:
			Month = "May";
			no_of_Days = 31;
			break;
		case 6:
			Month = "June";
			no_of_Days = 30;
			break;
		case 7:
			Month = "July";
			no_of_Days = 31;
			break;
		case 8:
			Month = "August";
			no_of_Days = 31;
			break;
		case 9:
			Month = "September";
			no_of_Days = 30;
			break;
		case 10:
			Month = "October";
			no_of_Days = 31;
			break;
		case 11:
			Month = "November";
			no_of_Days = 30;
			break;
		case 12:
			Month = "December";
			no_of_Days = 31;
			break;
		}
		System.out.println(Month +" "+ year +" "+"has"+" "+ no_of_Days+""+"days"); 
		
		
	}

}
