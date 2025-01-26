package com.Arrays;

public class Arrays5 {

	public static void main(String[] args) {
	int  [] num = {10,4,3,0,2,1,4,2,1,0};
	int maxsec=num[0];
	int maxfir=num[0];
	
	for(int i = 0;i<num.length;i++) {
		
		if(num[i]<maxsec) {
			maxsec= num[i];
		}
		else if(num[i]>maxsec && num[i]<maxfir) {
			maxsec=num[i];
			 
		}
		
		System.out.println(maxsec);
	}

    
	}

}
