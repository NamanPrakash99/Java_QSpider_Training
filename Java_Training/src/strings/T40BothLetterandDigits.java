package strings;

public class T40BothLetterandDigits {

	public static void main(String[] args) {
		String s="abc123";
		boolean hasLetter=false, hasDigit=false;
		
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z') {
				hasLetter=true;
			}
			else if(ch>='0'&&ch<='9') {
				hasDigit=true;
			}
		}
		System.out.println(hasLetter && hasDigit);
	}

}
