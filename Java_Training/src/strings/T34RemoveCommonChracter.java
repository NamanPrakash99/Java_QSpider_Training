package strings;

public class T34RemoveCommonChracter {

	public static void main(String[] args) {
		String a="abc";
		String b="apple";
		String result="";

		for(int i=0;i<b.length();i++){
			if(a.indexOf(b.charAt(i))==-1) {
				result+=b.charAt(i);
			}
		}
		System.out.println(result);
	}

}
