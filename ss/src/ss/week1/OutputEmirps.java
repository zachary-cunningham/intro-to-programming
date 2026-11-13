package ss.week1;

import java.util.*;
/**
 * To do this right, use the following procedure:
 * 1. Create a method.
 * 2. Add Javadoc above the method describing what the method does.
 * 3. Write comments inside the method, containing pseudocode of the algorithm.
 * 4. Finally, write code below each comment.
 * When signing off, the TA expects to see Javadoc and comments, so don’t delete them!

 **/


public class OutputEmirps {
    // A method public static boolean isPrime(int number)that returns true if and only if
    // the given number is a prime number
    public static boolean isPrime(int number) {
        return false;
        // import this from our OutputPrimes class
    }

    // • A method public static int reverse(int number) that reverses the digits of a number
    // and returns the result.
    public static int reverse(int number) {
        // Hint: to reverse a number, use Integer.toString and String.toCharArray, then create a String
        // with the same characters reversed, and convert that back to int.

        // take number

        // turn into a string
        String str = Integer.toString(number);

        // turn into an array of chars
        char[] characters = str.toCharArray();

        // turn into array of ints
        int[] numbers = new int[characters.length];

        // reverse the array
        int[] reversed = new int[characters.length];

        for (var i = numbers.length - 1; i > -1; i--) {
            int pointer = numbers.length - i - 1;
            reversed[pointer] = numbers[i];
        }

        // turn into string
        String[] assembled = new String[]{Arrays.toString(reversed)};

        // turn into a single string number


        // turn into int
    }

    // • A method public static boolean isEmirp(int number)that returns true if and only if
    // the given number is an emirp, using the methods isPrime and reverse.
    public static boolean isEmirp(int number) {
        return false;
    }


    public static void main(String[] args) {
        System.out.println("How many emirps?");
        Scanner input = new Scanner(System.in);
//        int numEmirps = input.nextInt();

        int num = input.nextInt();
        System.out.println(reverse(num));
    }
}
