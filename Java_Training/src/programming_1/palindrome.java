package programming_1;
import java.util.Scanner;

public class palindrome {
    
    public static int checkpalindrome(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int reversedNumber = checkpalindrome(n);
        
        if (n == reversedNumber) {
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }
        
    }
}