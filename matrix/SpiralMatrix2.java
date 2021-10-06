package matrix;

import java.util.ArrayList;

public class SpiralMatrix2 {
	
	static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c){
		
		ArrayList<Integer> output = new ArrayList<>();
		
		int row = 0; 
		int col = 0;
		
		while(row<r && col<c) {
			
			//printing first row
			for(int i = col; i<c; i++)
				output.add(matrix[row][i]);
			row++;
			
			//printing last col
			for(int i = row; i<r; i++)
				output.add(matrix[i][c-1]);
			col--;
			
			//printing last row
			if(row<r) {
				for(int i = c-1; i>=col; --i)
					output.add(matrix[r-1][i]);
				r--;
			}
			
			//printing first col
			if(col<c) {
				for(int i = r-1; i>=row; --i)
					output.add(matrix[i][col]);
				c++;
			}
			
			
			
		}
		
		return output;
		
	}

	public static void main(String[] args) {
		
	}

}
