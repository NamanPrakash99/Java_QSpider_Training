package strings;

public class T32RemoveOddINdexedCharacter {

	public static void main(String[] args) {
		String s="abcdef";
		String result="";

		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				result+=s.charAt(i);
			}

		}
		System.out.println(result);
	}

}
