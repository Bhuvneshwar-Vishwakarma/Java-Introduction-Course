package javaPracticle;

public class TransposeMatrix{

 	public static void main(String[] args){
		int row = 3, column = 3;
		int[][] matrix = {{1,2,3}, 
						  {4,5,6}, 
						  {7,8,9}};
		System.out.println(" Matrix is ");

		for(int i = 0; i<row; i++){
			for(int j = 0; j<column; j++){
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		int[][] transpose = new int[column][row];
		for(int i = 0; i<row; i++){
			for(int j = 0; j<column; j++){
				transpose[i][j] = matrix[j][i];
			}
			System.out.println();
		}
		System.out.println(" Transpose matrix is ");
	
		for(int i = 0; i<row; i++){
			for(int j = 0; j<column; j++){
				System.out.print(" "+transpose[i][j]);
			}
			System.out.println();
		}
	}
}
	
