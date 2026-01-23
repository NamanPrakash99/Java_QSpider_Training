package strings;
import java.util.*;

public class T30AnagramCheck {

	public static void main(String[] args) {
		String a="listen", b="silent";
		char[] x=a.toCharArray();
		char[] y=b.toCharArray();

		Arrays.sort(x);
		Arrays.sort(y);

		System.out.println(Arrays.equals(x,y));
	}

}
