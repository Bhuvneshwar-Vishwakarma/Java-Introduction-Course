package arrayIntro;

public class InitializationOfArray {
	
		public static void main(String[] args) {
	
			int[] age = {78,66,65,53,56,54,25};
			age[4] = 28; //Reinitialiazation of Array's Element
			
//			System.out.println(age[4]);
//			Accesing All Value Of Array
			for(int i = 0; i < age.length; i++) {
				System.out.println(age[i]); // age.length for length of array
			}
}

}
