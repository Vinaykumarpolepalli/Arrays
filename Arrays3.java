package com.Arrays;

public class Arrays3 {

	public static void main(String[] args) {
		int [] age = {10,20,30,40};
		int max=age [0];
		int min = age[0];
		int max1 = age [0];
		int max2 = age [0];
		
		for(int age1:age) {
			if(age1<min) {
				min = age1;
			}
			else if(age1>max) {
				max=age1;
				
			}
		}
		
			
			for(int age1:age) {
			if(age1 >max1 && age1 <max) {
				max1 = age1;
			}
			
			
			}
			for(int age2:age ) {
				if(age2>max2 && age2 <max1) {
					max2=age2; 
				}
			
		
		}
		System.out.println(min);
       System.out.println(max);
       System.out.println(max1);
       System.out.println(max2);
       
       
       
       
     
	}

}



             
