package com.Arrays;
import java.util.Scanner;
		public class SpyArray {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        
		        if (isSpyNumber(number)) {
		            System.out.println(number + " is a Spy Number");
		        } else {
		            System.out.println(number + " is NOT a Spy Number");
		        }

		        scanner.close();
		    }
		
		    public static boolean isSpyNumber(int num) {
		        int sum = 0,
		         product = 1,
		         digit;

		        while (num > 0) {
		            digit = num % 10; 
		            sum = sum+ digit;     
		            product = product *digit;
		            num = num /10;  }

		        return sum == product;

}
		}
