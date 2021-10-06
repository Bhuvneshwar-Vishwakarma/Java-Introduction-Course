package arrayIntro;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int  i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int data = sc.nextInt();
		if(binarySearch(arr, data) == true) {
			System.out.println("Data is available in array");
		}else {
			
		System.out.println("Data is not available in array");
		}
	}
	
	public static boolean binarySearch(int[] arr, int data) {
		
		int lo = 0;
		int hi = arr.length - 1;
		
		for(int i = 0; i<arr.length; i++) {
			int mid = (lo + hi) / 2;
			
			if(data < mid) {
				
				hi = mid;
			}else if(data > mid){
				
				lo = mid;
			}else if(data == mid) {
				return true;
			}else {

				return false;
				
			}
			
		}
		return false;

	}


}
