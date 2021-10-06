package arrayIntro;
import java.util.Arrays; 

// Java program to count 
//inversions in an array 
public class CountInversion{//           **This is O(n^2) Approach **
	
//	static int[] arr = new int[] {2,3,1,9,4,23,5,7};
//	
//	static int getInvCount(int n) {
//		int count = 0;
//		for(int i = 0; i<n-1; i++) {
//			for(int j = i+1; j<n; j++) {
//				if(arr[i]>arr[j])
//					count++;
//			}
//		}
//		
//		return count;
//	}
//	
//	
//	public static void main(String[] args) {
//		System.out.println(getInvCount(arr.length));
//	}
	
	//*************************************************************************//************************************//
	
		private static int mergeAndCount(int[] arr,int l, int m, int r){ //O(nlogn)

			// Left subarray 
			int[] left = Arrays.copyOfRange(arr, l, m + 1); 

			// Right subarray 
			int[] right = Arrays.copyOfRange(arr, m + 1, r + 1); 

			int i = 0, j = 0, k = l, swaps = 0; 

			while (i < left.length && j < right.length) 
			{ 
				if (left[i] <= right[j]) 
					arr[k++] = left[i++]; 
				else { 
					arr[k++] = right[j++]; 
					swaps += (m + 1) - (l + i); 
				} 
			} 
			return swaps; 
		} 

		// Merge sort function 
		private static int mergeSortAndCount(int[] arr,int l, int r) { 
			
			int count = 0; 

			if (l < r) { 
				int m = (l + r) / 2; 

				// Total inversion count = left subarray count 
				// + right subarray count + merge count 

				// Left subarray count 
				count += mergeSortAndCount(arr, l, m); 

				// Right subarray count 
				count += mergeSortAndCount(arr, m + 1, r); 

				// Merge count 
				count += mergeAndCount(arr, l, m, r); 
			} 

			return count; 
		} 

		// Driver code 
		public static void main(String[] args) 
		{ 
			int[] arr = { 1, 20, 6, 4, 5 }; 

			System.out.println(mergeSortAndCount(arr, 0, 
											arr.length - 1)); 
		} 
	} 

	