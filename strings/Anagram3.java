package strings;

public class Anagram3 {

	public static void main(String[] args) {
		
//		Best of Anagram
//		important for placement
		
		String a = "aab";
		String b = "lcb";
		
		boolean isAnagram = true;
		
		int al[] = new int [256];
		
		for(char c: a.toCharArray()) {
			int index = (int) c;
			al[index]++;
		}
		for(char c: b.toCharArray()) {
			int index = (int) c;
			al[index]--;
		}
	    for(int i = 0; i<256; i++) {
	    	if(al[i] != 0) {
	    	 	isAnagram = false;
	    		break;
	    	}
	    }
		if(isAnagram) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
			}
		}

}

