package interviewQuestions;

//Java implementation of the approach 
import java.util.Arrays; 

public class CountInversion2{
	
	public static int countInversion(int arr[], int l, int m, int r) { 
		
		int[] left = Arrays.copyOfRange(arr, l, m+1);
		int[] right = Arrays.copyOfRange(arr, r+1, m+1);
		
		int i = 0, j=0, k=l, swap =0;
		
		while(i<left.length && j<right.length) {
			
			if(left[i] <= right[j]) {
				arr[k++] = left[i++];
			}else {
				arr[k++] = right[j++];
				swap += (m+1)-(l+i);
			}
		}
		
		return swap;
	}
	
	public static int mergeSortAndCount(int arr[], int r, int l) {
		
		int count = 0;
		if(l<r) {
			int m = (l+r)/2;
			
			count += mergeSortAndCount(arr,l,m);
			count += mergeSortAndCount(arr,m+1,r);
			count += countInversion(arr,l, m, r);
			
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		
	}
}
