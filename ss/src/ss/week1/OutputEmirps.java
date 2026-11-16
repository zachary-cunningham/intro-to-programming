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
        // output is true or false

        // set a minimum number we know is prime
        var i = 2;

        // for every integer lower than given number
        while (i < number) {

            // if there is no remainder by dividing num / i
            if ((number % i) == 0) {
                // return is not prime, immediately exit loop
                return false;
            } else {

                // else continue for rest
                i ++;
            }
        }

        // if we reach the end of the loop, then it is a prime
        return true;
    }

    // • A method public static int reverse(int number) that reverses the digits of a number
    // and returns the result.
    public static int reverse(int number) {
        // Hint: to reverse a number, use Integer.toString and String.toCharArray, then create a String
        // with the same characters reversed, and convert that back to int.

        // turn given number into a string
        String str = Integer.toString(number);

        // turn into an array of chars
        char[] characters = str.toCharArray();
        String assembled = "";

        for (var i = 0; i < characters.length; i++) {
            assembled = characters[i] + assembled;
        }

        // turn into a single number
        int num = Integer.parseInt(assembled);

        return num;
    }

    // • A method public static boolean isEmirp(int number)that returns true if and only if
    // the given number is an emirp, using the methods isPrime and reverse.
    public static boolean isEmirp(int number) {
        return (isPrime(number) && isPrime(reverse(number)) && (reverse(number) != number));
    }

    public static void main(String[] args) {
        System.out.println("How many emirps?");
        Scanner input = new Scanner(System.in);
        int numEmirps = input.nextInt();

        // create array to store emirps
        int[] emirps = new int[numEmirps];

        // until our array is populated!
        int pointer = 0;
        int testVal = 1; // continues to increase
        while (pointer < numEmirps) {

            boolean found = false;
            while (!found) {
                if (isEmirp(testVal)) {
                    emirps[pointer] = testVal;
                    found = true;
                }
                testVal++;
            }
            pointer ++;
        }

        System.out.println(Arrays.toString(emirps));


        // testing the reverse
//        while (1 == 1) {
//            System.out.println("gimme a number to reverse");
//            Scanner input = new Scanner(System.in);
//            int num = input.nextInt();
//            System.out.println(reverse(num));
//        }
    }
}
