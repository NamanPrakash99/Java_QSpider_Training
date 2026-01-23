package strings;

public class T28ReverseEachWord {

	public static void main(String[] args) {
		String s="Java is fun";
		String[] words=s.split(" ");

		for(String w:words){
			String rev="";
			for(int i=w.length()-1;i>=0;i--) {
			rev+=w.charAt(i);
		}
		System.out.print(rev+" ");
		}
	}

}
