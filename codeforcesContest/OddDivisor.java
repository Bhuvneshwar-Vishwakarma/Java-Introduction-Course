package codeforcesContest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddDivisor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t > 0) {
			long n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				return;
			}
			
			int i = 1;
			while(i < n - 1) {
				i = i + 2;
				if(n % i == 0) {
					if(n > 1) {
						System.out.print("YES");
						break;
					}
				}else {
					System.out.println("NO");
					break;
					
				}
			}
			t--;
		}

	}

}
