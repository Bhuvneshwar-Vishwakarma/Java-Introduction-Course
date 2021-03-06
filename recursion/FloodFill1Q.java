package recursion;

public class FloodFill1Q {

	public static void main(String[] args) {
		
		int a[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
					{1, 1, 1, 1, 1, 1, 0, 0},
					{1, 0, 0, 1, 1, 0, 1, 1},
					{1, 2, 2, 2, 2, 0, 1, 0},
					{1, 1, 1, 2, 2, 0, 1, 0},
					{1, 1, 1, 2, 2, 2, 2, 0},
					{1, 1, 1, 1, 1, 2, 1, 1},
					{1, 1, 1, 1, 1, 2, 2, 1},
		            };
		floodFill(a, 4, 3, 3, 2);
		printMatrix(a);
	}
	
	static void printMatrix(int[][] a) {
			for(int[] array: a) {
				for(int element: array) {
					System.out.print(element +" ");
				}
				System.out.println();
			}
		}

	static void floodFill(int a[][], int r, int c, int toFill, int prevFill) {
		int rows = a.length;
		int cols = a[0].length;   // Flood Fill Question
		
		if(r < 0 || r >= rows || c < 0 || c >= cols) {
			return;
		}
		if(a[r][c] != prevFill) {
			return;
		}
		a[r][c] = toFill;
		
		floodFill(a, r-1, c, toFill, prevFill);
		floodFill(a, r, c-1, toFill, prevFill);
		floodFill(a, r+1, c, toFill, prevFill);
		floodFill(a, r, c+1, toFill, prevFill);
	}
}
		


