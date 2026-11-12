package ss.week1;
import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

/**
 * Write a program that asks the user for a word, then translates the word to digits using this mapping. Your
 * program must translate both lowercase and uppercase letters, and ignore nonalphabetical input.
 * Use something like String.charAt or String.toCharArray and a switch-statement for your
 * implementation.
 * **/

public class WordsToDigits {
    public static void main(String[] args) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabet = alph.toCharArray();

        System.out.println("input a word: ");
        Scanner input = new Scanner(System.in);
        // save word
        String word = input.nextLine();
        word = word.toLowerCase();
        char[] wrd = word.toCharArray();
//        System.out.println(wrd[2]);

        // loop through word array
        // for each letter, find its index in the alphabet
        // append that to new array
        int[] mapped = new int[word.length()];

        for (int i = 0; i < wrd.length; i++) {
            // for each letter now;
            boolean foundItem = false;
            int j = 0;
            while ((!foundItem) && (j < alphabet.length)) {
                if (wrd[i] == alphabet[j]) {
                    foundItem = true;
                    mapped[i] = j;
                } else {
                    j ++;
                }
            }

            // at this point, we've mapped all values to high alphabet numbers
            // we need to fit them into the keypad
            // per letter (we're already in this loop)
            // div it by 3, and then add 2

            int temp = mapped[i];
            if ((mapped[i] >= 18) && (mapped[i] < 25)) {
                temp = Math.floorDiv(temp - 1, 3);
                temp = temp + 2;
                mapped[i] = temp;
            } else if (mapped[i] == 25) {
                mapped[i] = 9;
                System.out.println("hey");
            } else {

                temp = Math.floorDiv(temp, 3);
                temp = temp + 2;
                mapped[i] = temp;
            }

            System.out.print(mapped[i]);

            // unless, the letter is >= s++

        }


    }

}


