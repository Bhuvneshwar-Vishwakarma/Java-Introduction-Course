package matrix;

public class RowWithMax1 {
	
	
	int rowWMaxOne(int[][] arr, int n, int m) {
		
		int r = 0;
		int c = m-1;
		int max_row_index = -1;
		
		while(r<n && c>=0) {
			if(arr[r][c] == 1) {
				max_row_index = r;
				c--;
			}else
				r++;
		}
		
		return max_row_index;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
