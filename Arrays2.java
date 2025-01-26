package com.Arrays;

public class Arrays2 {
	
	public static void main(String[] args) {
	int sum = 0;
	double avg = 0;
	//int max = 0;
	
	int [] list = {10,20,30,40,50,60,70,80,90,100};
	for(int i=0;i<list.length;i++ ) {
		sum = sum+list[i];
        
	}

	avg = sum/list.length;
	System.out.println(sum);
	System.out.println(avg);
	
}
}