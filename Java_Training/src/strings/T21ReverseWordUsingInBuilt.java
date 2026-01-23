package strings;

public class T21ReverseWordUsingInBuilt {

	public static void main(String[] args) {
		String s="Java is fun";
		String[] words=s.split(" ");

		for(int i=words.length-1;i>=0;i--)
		System.out.print(words[i]+" ");
	}

}
