package strings;

public class T35LargestandSmallestWord {
	public static void main(String[] args) {
		String s="Java is powerful language";
		String[] words=s.split(" ");
		String small=words[0], large=words[0];

		for(String w:words){
			if(w.length()<small.length()) {
				small=w;
			}
			else if(w.length()>large.length()) {
				large=w;
			}
		}
		System.out.println("Small: "+small);
		System.out.println("Large: "+large);
	}
}
