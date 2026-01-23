package strings;

public class T31PanagramCheck {

	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog".toLowerCase();
		boolean[] m=new boolean[26];

		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
				m[ch-'a']=true;
				}
			}

		boolean pangram=true;
		for(boolean b:m) {
			if(!b) pangram=false;
		}

		System.out.println(pangram);
	}

}
