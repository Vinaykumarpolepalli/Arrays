package com.Arrays;

public class Array2d1 {

	public static void main(String[] args) {
		int [][] num = {{10,20},{19,30},{20,39,40}};
		

		for(int i =0;i<num.length;i++) {
		for(int j= 0;j<num[i].length;j++) {
			System.out.print(num[i][j]+" ");
		}
			System.out.println();
		}
		
		
		
System.out.println("***************");	


short [][] num5 = {{},{10,30,45},{}};


for(int d =0;d<num5.length;d++) {
for(int d2= 0;d2<num5[d].length;d2++) {
	System.out.print(num5[d][d2]+" ");	
	//System.out.print(num5+" ");
}
	System.out.println();
}

System.out.println("***************");	
		
float [][] num1 = {{10,20},{19,30},{20,39,40}};
		

		for(int f =0;f<num1.length;f++) {
		for(int f2= 0;f2<num1[f].length;f2++) {
			System.out.print(num1[f][f2]+" ");
		}
			System.out.println();
		}
		
		
		System.out.println("***************");	
		
		
double [][] num2 = {{10.00,20},{19,30},{20,39,40}};
		

		for(int d =0;d<num2.length;d++) {
		for(int d2= 0;d2<num2[d].length;d2++) {
			System.out.print(num2[d][d2]+" ");
		}
			System.out.println();
		}
		
		System.out.println("***************");	
		
char [][] num3 = {{'v','i','n','a','y'},{'n','a','v','e','e','n'}};
		

		for(int d =0;d<num3.length;d++) {
		for(int d2= 0;d2<num3[d].length;d2++) {
			System.out.print(num3[d][d2]+" ");
		}
			System.out.println();
			
			
		}

		System.out.println("***************");	
Boolean [][] num4 = {{false,true},{true,false}};
		

		for(int d =0;d<num4.length;d++) {
		for(int d2= 0;d2<num4[d].length;d2++) {
			System.out.print(num4[d][d2]+" ");	
			System.out.print(num4+" ");
		}
			System.out.println();
		}

	}

}
