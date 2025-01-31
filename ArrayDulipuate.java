package com.Arrays;
import java.util.Set;
import java.util.HashSet;



public class ArrayDulipuate {

	public static void main(String[] args) {
int [] num = { 50,50,50,10,30,20,20};
 Set <Integer> s1 = new HashSet<>();
   
 
 for ( int n1 : num) {
	 if(s1.add(n1)) {
		 System.out.print(n1+" ");
		 
	 }
 }
	}

}
