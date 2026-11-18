package ss.week1;
import java.util.*;

/**
 * Two classic ciphers, the Caesar cipher and the Vigenere cipher. Only the
 * letters a to z and A to Z are encrypted, and they keep their case; all
 * other characters stay the same.
 */
public class SecretMessages {
    /**
     * Shifts a letter the given number of places further in the alphabet,
     * wrapping around from z to a. The letter keeps its case.
     * @param c the character to shift
     * @param shift the number of places, from 0 to 25
     * @return the shifted letter, or c itself if it is not one of the
     *         letters a to z or A to Z
     **/
    public static char shiftLetter(char c, int shift) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabet = alpha.toCharArray();

        // determine if it's a letter to shift
        boolean foundIndex = false;
        boolean isLetter = false;
        boolean isCapital = Character.isUpperCase(c);

        int index = 0;
        while (!foundIndex && index <= 25) {
            if (Character.toLowerCase(c) == alphabet[index]) {
                foundIndex = true;
                isLetter = true;
            } else {
                index++;
            }

        }

        char shifted = c;

        // only shift if c is a letter
        if (isLetter) {
            int newIndex = (index + shift) % 26;
            shifted = alphabet[newIndex];

            if(isCapital) {
                shifted = Character.toUpperCase(shifted);
            }
        }
        return shifted;
    }

    /**
     * Encrypts a text with the Caesar cipher: every letter is shifted the
     * given number of places.
     * @param text the text to encrypt
     * @param shift the number of places, from 0 to 25
     * @return the encrypted text
     */
    public static String caesarEncrypt(String text, int shift) {

        char[] arr = text.toCharArray();
        String shifted = "";
        int modShift = shift;
        if(modShift < 0) {
            modShift += 26;
        }

        for(var i = 0; i < arr.length; i++) {
            shifted = shifted + shiftLetter(arr[i], modShift);
        }

        return shifted;
    }

    /**
     * Decrypts a text that was encrypted with caesarEncrypt.
     * @param text the text to decrypt
     * @param shift the shift that was used to encrypt it, from 0 to 25
     * @return the decrypted text
     */
    public static String caesarDecrypt(String text, int shift) {
        return caesarEncrypt(text, -shift);
    }

    /**
     * Encrypts a text with the Vigenere cipher: every letter is shifted
     * by the next letter of the key (a shifts by 0, b by 1, ...,
     * z by 25). When the key is used up, it starts again. Other
     * characters do not use up a letter of the key.
     * @param text the text to encrypt
     * @param key the key; at least one letter, only a to z
     * @return the encrypted text
     */
    public static String vigenereEncrypt(String text, String key) {
        return null; // TODO
    }

    /**
     * Decrypts a text that was encrypted with vigenereEncrypt.
     * @param text the text to decrypt
     * @param key the key that was used to encrypt it
     * @return the decrypted text
     */
    public static String vigenereDecrypt(String text, String key) {
        return null; // TODO
    }

    public static void main(String[] args) {
        // testing shift
        Scanner input = new Scanner(System.in);


        System.out.println("What would you like to decrypt?");
        String text = input.nextLine();
        System.out.println("How many shifts?");
        int shift = input.nextInt();
        System.out.println(caesarDecrypt(text, shift));
    }
}
