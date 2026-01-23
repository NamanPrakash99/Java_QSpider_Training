package exceptions;

public class T171stLetterUpperCase {

	public static void main(String[] args) {
		String s="java is fun";
		String[] words=s.split(" ");
		String result="";

		for(String w:words){
		result+=Character.toUpperCase(w.charAt(0))+w.substring(1)+" ";
		}
		System.out.println(result.trim());
	}

}
