package com.Arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int [][] num = new int[2][2];
		num[0]=new int[3];
		num[1]=new int[3];
		
		num [0][0]=10;
		num[0][1]=20;
		num[0][2]=30;
		
		num[1][0]=10;
		num[1][1]=20;
		num[1][2]=30;
		for (int i =0;i<num.length;i++) {
			for(int j =0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			 System.out.println();
		}
       
	}

}
