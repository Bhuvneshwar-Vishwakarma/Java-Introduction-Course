package arrayIntro;

public class Sorto1 {

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 4, 5, 6, 7};
		int gis = 6;
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				sum = sum + a[i];
				if(sum == gis) {
					System.out.println(a[i]);
					
				}
			}
			sum = 0;
		}
	}
}