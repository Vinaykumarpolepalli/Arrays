package com.Arrays;

public class Arrays2d {

	public static void main(String[] args) {
		int [][] num = new int[3][3];
		
	num  [0][0]=10;
    num  [0][1]=20;
    num [0][2]=30;
    num [1][0]=40;
	
		for(int i =0;i<num.length;i++) {
		for(int j= 0;j<num[i].length;j++) {
			System.out.print(num[i][j]+" ");
		}
			System.out.println();
		}
		

	}

}
