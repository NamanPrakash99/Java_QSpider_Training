package strings;

public class T36RemoveAdjacentPairs {

	public static void main(String[] args) {
		String s="abbaca";
		String result="";

		for(int i=0;i<s.length();i++){
			if(result.length()>0 && result.charAt(result.length()-1)==s.charAt(i)){
				result=result.substring(0,result.length()-1);
				}
			else {
				result+=s.charAt(i);
			}
		}
		System.out.println(result);
	}

}
