package contestCodechef;

import java.util.Scanner;

public class Editor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		while(t > 0) {
			int n = s.nextInt();
			int i = 1;
			int j = n;
			int c = 1;
			while(i < j) {
				i++;
				j--;
				c++;
			}
			System.out.println(c);
			
			t--;
		}


	}

}
