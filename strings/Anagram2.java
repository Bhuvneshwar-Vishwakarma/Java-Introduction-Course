package strings;

public class Anagram2 {

	public static void main(String[] args) {
		
//		Good of Anagram****************
		
		String a = "aab";
		String b = "acb";
		
		boolean isAnagram = true;
		
		int al[] = new int [256];
		int bl[] = new int [256];
		
		for(char c: a.toCharArray()) {
			int index = (int) c;
			al[index]++;
		}
		for(char c: b.toCharArray()) {
			int index = (int) c;
			bl[index]++;
		}
	    for(int i = 0; i<256; i++) {
	    	if(al[i] != bl[i]) {
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
