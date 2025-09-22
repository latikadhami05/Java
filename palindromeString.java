import java.util.*;

public class palindromeString {
    public static boolean isPalindrome(String str) {

        for (int i = 0; i < str.length(); i++) {
            int n = str.length();
            if (str.charAt(i) == str.charAt(n - i - 1)) { // is a palindrome
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}
