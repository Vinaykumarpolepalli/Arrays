package ImportantPrograms;

import java.util.Scanner;

public class RotationArray {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter elements");
     int num = sc.nextInt();
     System.out.print("Enter numbers"+" ");
     int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter how many roations needed:");
		int k = sc.nextInt();
		rtationRL(arr, k);
		
		
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

	public static void rtationRL(int[] arr, int k) {
		reverse(arr, 0, arr.length - 1);
//		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);
	}
		
	public static void reverse(int[] arr, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		

	}
}
