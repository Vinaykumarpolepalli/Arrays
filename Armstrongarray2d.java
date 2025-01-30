package com.Arrays;
import java.util.Scanner;

public class Armstrongarray2d {


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        int sum = 0;
	        int index = 0;
	        int temp = number;
	        int digits = String.valueOf(number).length(); // Count digits
	        int[][] powerArray = new int[digits][2]; // 2D array to store digits and their powers
	        
	     
	        

	        while (temp > 0) {
	            int digit = temp % 10; // Extract last digit
	            temp /= 10;           // Remove last digit
	            powerArray[index][0] = digit;              // Digit
	            powerArray[index][1] = (int) Math.pow(digit, digits); // Digit^digits            
	            sum = sum+powerArray[index][1]; // Add the power to the sum
	            index++;
	        }


	        // Check if the number is an Armstrong number
	        if (sum == number) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	        
	        scanner.close();
	    
	}

}
