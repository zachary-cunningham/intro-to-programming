package ss.week1;
import java.util.Arrays;

public class Palindrome {
    public static boolean isPalindrome(int[] test) {
        // base case, true.
        if (test[0] != test[test.length-1]) {
            return false;
        } else {
            if (test.length > 2) {
                int[] nextList = Arrays.copyOfRange(test, 1, test.length-1);
                return isPalindrome(nextList);
            } else {
                return true;
            }

        }

        // look at start and end, if not equal, return false
        // otherwise, call, with the first and end dropped
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 4, 5, 2, 1};
        System.out.println(isPalindrome(test));
    }
}
