package strings;

public class T46CompressString {

	public static void main(String[] args) {
		String s="aaabbc";
		String result="";
	        for (int i = 0; i < s.length(); i++) {
	            int count = 1;
	            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
	                count++;
	                i++;
	            }
	            result = result + s.charAt(i) + count;
	        }

	        System.out.println(result); 
	}

}
