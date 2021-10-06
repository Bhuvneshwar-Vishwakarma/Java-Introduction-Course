package matrix;

public class MedianOfMatrix {
	
	static int binaryMedian(int m[][], int r, int c) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i<r; i++) {
			if(m[i][0] < min) {
				min = m[i][0];
			}
			if(m[i][c-1]>max) {
				max = m[i][c-1];
			}
		}
		
		int desired = (r*c+1)/2;
		
		while(min < max) {
			int mid = min + (max - min)/2;
		}
		
		return 0;
		
	}

	public static void main(String[] args) {
	
	}

}
