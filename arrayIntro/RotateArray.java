package arrayIntro;

import java.util.*;
import java.lang.*;
import java.io.*;

class RotateArray {
	public static void main (String[] args) {
//		int t,n,i;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0){
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			
			for(int i = 0; i<n; i++){
				a[i] = sc.nextInt();
			}
			for(int i = 0; i<n; i++){
				if(i<n-1){
					b[i+1] = a[i];
				}
				else{
					b[0] = a[n-1];
				}
			}
			for(int i = 0; i<n; i++){
				System.out.print(b[i]+" ");
			}
			System.out.print("\n");
			t--;
		}
	}
}
