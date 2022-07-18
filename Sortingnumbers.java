package com.training.mars;
import java.util.Scanner;

public class Sortingnumbers {

	public static void main(String[] args) {
		int count, temp;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of elements:");
		count = scanner.nextInt();
		
		int num[] = new int[count];
		System.out.println("Enter Array Elements");
		for(int i=0; i<count;i++) {
			num[i] = scanner.nextInt();
		}
		scanner.close();
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.print("Array elements in Ascending Order:");
		for(int i=0;i<count - 1;i++) {
			System.out.print(num[i]+",");
			
		}
		System.out.print(num[count-1]);
	}

}
