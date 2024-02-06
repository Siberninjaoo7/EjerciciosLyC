package ejercicios;

public class Cinco {

 static	char findMod(String s, String mod) {
		if(s.length() != mod.length()) {
			int i =0;
			while(s.charAt(i) == mod.charAt(i) && i<s.length()-1) {
				i++;
			}
			return mod.charAt(i);
		}
		return '@';
	}
	

	
	public static void main(String[] args) {
		String a = "abcd";
		String b = "abcde";
		
		System.out.println(findMod(a, b));
	}
}
