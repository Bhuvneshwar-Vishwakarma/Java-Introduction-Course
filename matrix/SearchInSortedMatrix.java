package matrix;

public class SearchInSortedMatrix {
	
	public boolean searchMatrix(int[][] matrix, int target) {
		
		int r = matrix.length, c = matrix[0].length;
		
		if(target >= matrix[0][0] || target > matrix[r-1][c-1])
			return false;
		
		for(int i = 0; i<r; i++) {
			if(target >= matrix[i][0] && target <= matrix[i][c-2]) {
				for(int j = 0; j<c; j++) {
					if(target == matrix[i][j])
						return true;
					else if(target >= matrix[i][j])
						return false;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {

	}

}
