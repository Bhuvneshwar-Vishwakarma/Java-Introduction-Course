package arrayIntro;


import java.util.*;
import java.lang.*;
import java.io.*;

class UnionOfArray {
	public static void main(String args[]) 
    {   
        Scanner s = new Scanner(System.in);
       // System.out.println("Enter the length of the array:");
        int m = s.nextInt();
        int [] arr1 = new int[m];
        //System.out.println("Enter the elements of the array:");

        for(int i=0; i<m; i++ ) {
            arr1[i] = s.nextInt();
        }

      System.out.println(Arrays.toString(arr1));
      
      
       // System.out.println("Enter the length of the array:");
        int n = s.nextInt();
        int [] arr2 = new int[n];
        //System.out.println("Enter the elements of the array:");

        for(int i=0; i<n; i++ ) {
            arr2[i] = s.nextInt();
        }

      System.out.println(Arrays.toString(arr2));
        
        
        printUnion(arr1, arr2, m, n); 
    } 
	     /* Function prints union of arr1[] and arr2[] 
    m is the number of elements in arr1[] 
    n is the number of elements in arr2[] */
    static int printUnion(int arr1[], int arr2[], int m, int n) 
    { 
        int i = 0, j = 0; 
        while (i < m && j < n) { 
            if (arr1[i] < arr2[j]) 
                System.out.print(arr1[i++] + " "); 
            else if (arr2[j] < arr1[i]) 
                System.out.print(arr2[j++] + " "); 
            else { 
                System.out.print(arr2[j++] + " "); 
                i++; 
            } 
        } 
  
        /* Print remaining elements of  
         the larger array */
        while (i < m) 
            System.out.print(arr1[i++] + " "); 
        while (j < n) 
            System.out.print(arr2[j++] + " "); 
  
        return 0; 
    } 
  
}