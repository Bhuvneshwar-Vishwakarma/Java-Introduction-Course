package matrix;
import java.util.*;

public class SortTheMatrix {
	public static void main (String[] args) {
		
	    int i,n,t,j = 0;
	    int [] arr;
	    Scanner sc = new Scanner(System.in);
	    t = sc.nextInt();
	    
	    for(i = 0; i < t; i++){
	    	n = sc.nextInt();
	    	arr = new int[n*n];
	    	j = 0;
	     
		     	while(j < (n*n)){
		     		arr[j] = sc.nextInt();
		     		j++;
		     	}
	     
		     	Arrays.sort(arr);
		     	j = 0;
		      
		     	while(j < (n*n)){
		     		System.out.print(arr[j]+" ");
		     		j++;
		     	}
		     	System.out.println();
		    }
		}
}
	
		
		
			
		

