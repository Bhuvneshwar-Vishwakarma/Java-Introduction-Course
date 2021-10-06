package arrayIntro;

import java.util.Scanner;

public class BinarySearch2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter element of array");
		for(int  i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter data for search");
		int data = sc.nextInt();
		
		int lo = 0; 
		int hi = arr.length - 1;
		
		while(lo <= hi) {
			int mid = (lo + hi) / 2;
			
			if(data > arr[mid]) {
				lo = mid + 1;
				
			}else if(data < arr[mid]) {
				hi = mid - 1;
			}else {
				System.out.println("Index of Element is " + mid);
				return;
			}
		}
		System.out.println(-1);
	}

}
