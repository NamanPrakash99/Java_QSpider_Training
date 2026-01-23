package strings;
import java.util.*;
public class T33RemoveCharacterUserBased {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String inputString = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char targetChar = sc.next().charAt(0);

        // Converting char to String and replace it with an empty string
        String result = inputString.replace(String.valueOf(targetChar), "");

        System.out.println("Modified String: " + result);
	}

}
