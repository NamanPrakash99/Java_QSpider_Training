package strings;

public class T39OnlyLetters {

	public static void main(String[] args) {
		String s="Hello";
		boolean ok=true;

		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(!(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')) {
				ok=false;
			}
		}
		System.out.println(ok);
	}

}
