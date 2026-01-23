package strings;

public class T38OnlyDigits {

	public static void main(String[] args) {
		String s="12345";
		boolean ok=true;

		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)<'0' || s.charAt(i)>'9') {
				ok=false;
			}

		}

		System.out.println(ok);
	}

}
