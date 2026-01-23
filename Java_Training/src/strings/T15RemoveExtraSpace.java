package strings;

public class T15RemoveExtraSpace {

	public static void main(String[] args) {
		String s="Java is fun";
		System.out.println(s.trim().replaceAll("\\s+"," "));
	}

}
