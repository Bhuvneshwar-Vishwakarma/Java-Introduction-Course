package arrayIntro.sortingAlgorithm;

public class SelectionSort {

	public static void main(String[] args) {// All are O(n2)
		
		int a[] = {8,-5,6,1,7,2,9};
		int n = a.length;
		
		for(int i = 0; i<n-1; i++) {
			
			int minInd = 1;
			
			for(int j= 0; j<n; j++) {
				
				if(a[j] < a[minInd]) {
					minInd = j;
				}
			}
			int temp = a[i];
			a[i] = a[minInd];
			a[minInd] = temp;
		}
		for(int e: a) {
			System.out.println(e+" ");
		}

	}

}
