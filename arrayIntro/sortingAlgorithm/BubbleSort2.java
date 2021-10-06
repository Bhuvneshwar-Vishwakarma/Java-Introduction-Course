package arrayIntro.sortingAlgorithm;

public class BubbleSort2 {

	public static void main(String[] args) {
		
		int a[] = {0,1,-3,2,0,1,-2,2,0};// O(n), O(n2), O(n2)
		int n = a.length;
		
		for(int i = 0; i<n-1; i++) {
			
			for(int j = 0; j<n-1; j++) {
				
				if(a[j+1] < a[j]){
					
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
			
		}
		
		for(int item:a) {
			System.out.println(item+" ");
		}

	}

}
