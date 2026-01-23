package strings;

public class T27LongestWord {

	public static void main(String[] args) {
		String s="Java programming language";
		String[] words=s.split(" ");

		String longest=words[0];
		for(String w:words) {
			if(w.length()>longest.length()) {
				longest=w;
			}
		}
		System.out.println(longest);
	}

}
