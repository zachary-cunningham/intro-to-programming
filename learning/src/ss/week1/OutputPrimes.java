package ss.week1;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 1. input a number
 * 2. for loop, for all int < that num
 * 3. if input MOD i == 0 return FALSe
 * 4. otherwise, i += 1
 *
 * input number
 * have empty array of size number
 * starring value...
 * for each item in array
 *      (found item?)
 *      while not found:
 *            if isPrime(startingVal):
 *              found = true
 *            else:
 *              starting++
 * **/


public class OutputPrimes {
    public static boolean isPrime(int number) {
        // output is true or false
        var i = 2;
        while (i < number) {
            if ((number % i) == 0) {
                return false;
            } else {
                i ++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("How many primes would you like, sire?");
        /** * input number
         * have empty array of size number
         * starring value...
         * for each item in array
         *      (found item?)
         *      while not found:
         *            if isPrime(startingVal):
         *              found = true
         *            else:
         *              starting++
         * **/
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] array = new int[N];

        int start = 2;
        for (int i = 0; i < array.length; i++) {
            boolean found = false;
            while (!found) {
                if (isPrime(start)) {
                    found = true;
                    array[i] = start;
                    start ++;
                } else {
                    start ++;
                }
            }
        }

        System.out.println("Here it is, sire: " + Arrays.toString(array));
    }
}
