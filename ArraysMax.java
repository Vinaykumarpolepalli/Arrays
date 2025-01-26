package com.Arrays;

public class ArraysMax {

	public static void main(String[] args) {
		
		int [] num = {10,20,30,40,50,-1};
		int max = num[0];
		int min = num[0];
		int max1 = num[0];
	
		for(int i =0;i<num.length;i++) {
			if(num[i]>max) {
				max= num[i];
				
			}
			if(num[i]<min) {
				min= num[i];
			}
			
			
						
	}
		for(int a = 0;a<num.length;a++) {
			if(num[a]>max1 && num[a]< max) {
				max1 = num[a];}
		
		
		}
		
		System.out.println("max value is "+max);
		System.out.println("Min value is "+min);
		System.out.println("max1 value is "+max1);
	}

}
