package matrix;

public class SearchInMatrix {

	public static boolean searchInMatrix(int[][] matrix, int target) {
		
		if(matrix == null || matrix[0].length == 0)return false;
		if(matrix[0] == null || matrix[0].length == 0)return false;
		
		int r = matrix.length;
		int c = matrix[0].length;
		
		int irow = 0;
		int jcol = c-1;
		
		while(irow < r && jcol >= 0) {
			
			if(matrix[irow][jcol] == target)
				return true;
			
			else if(matrix[irow][jcol] < target)
				irow++;
			else
				jcol--;
		}
		
		
		return false;
	}
		
	
	public static void main(String[] args) {
		int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int element = 4;
		System.out.println(searchInMatrix(matrix, element));
		
	}

}
