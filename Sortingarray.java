package com.training.mars;
import java.util.Scanner;

public class Sortingarray {

	public static void main(String[] args) {
		int count;
		String temp;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of Strings:");
		count = scanner.nextInt();
		
		String str[] = new String[count];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Strings:");
		for(int i=0;i<count;i++) {
			str[i] = scan.nextLine();
		
		}
		scanner.close();
		scan.close();
		
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(str[i].compareTo(str[j])>0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
     System.out.print("Strings in Sorted Order:");
     for(int i=0;i<=count-1;i++) {
    	 System.out.print(str[i]+",");
     }
	}

}
