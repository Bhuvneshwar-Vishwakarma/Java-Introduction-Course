package arrayIntro;


public class MaxOfArray {

	public static void main(String[] args) {

		int a[][] = { {2,3,4},{23,12,13},{12,34,56} };
		int maxNum = a[0][0];
		int minNum = a[0][0];
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(maxNum < a[i][j]){
					maxNum = a[i][j];
				}
				else if(minNum > a[i][j]){
				  			minNum = a[i][j];
				  		}
				  	}
			  	}
			  System.out.println("Largest number: "  + maxNum );
			  System.out.println("And Sortest is number: "  + minNum );
			 }
	}

