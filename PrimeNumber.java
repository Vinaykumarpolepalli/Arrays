package com.Arrays;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter a  number");
     int size =sc.nextInt();
     int [] num =new int[size];
    
     
       for(int i =0;i<size;i++) {
    	   num[i]=sc.nextInt();
       }
       System.out.println("Prime numbers ");
     for (int i =0;i<size;i++) {
    	 boolean status=true;
    	 if(num[i]==1) {
    		 status = false;
    	 }
    	 for(int j=2;j<num[i];j++) {
    		 if(num[i]%j==0) {
    			 status=false;
    			 break;
    		 }
    	 }if(status) {
    			System.out.print(num[i]+" ");
     }
   
	
	}
    	 
     }
     }
