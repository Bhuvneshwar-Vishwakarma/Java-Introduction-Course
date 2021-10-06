package arrayIntro.sortingAlgorithm;

public class BubbleSort {

	public static void main(String[] args) {		
		
//		int a[] = {2,5,3,6,-1,1,4,7,98};
		int a[] = {0,1,0,2,0,1,2,2,0};
		int n = a.length;
		
		for(int i = 0; i<n-1; i++) {
			
//			boolean sorted = true;
			
			for(int j = 0; j<n-1; j++) {
				
				if(a[j+1] < a[j]){
					
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					
//					sorted = false;
				}
			}
			
//			if(sorted) break;
		}
		
		for(int item:a) {
			System.out.println(item+" ");
		}
	}

}
