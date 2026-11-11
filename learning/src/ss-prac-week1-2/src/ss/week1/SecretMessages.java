package ss;

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
     */
    public static char shiftLetter(char c, int shift) {
        return c; // TODO
    }

    /**
     * Encrypts a text with the Caesar cipher: every letter is shifted the
     * given number of places.
     * @param text the text to encrypt
     * @param shift the number of places, from 0 to 25
     * @return the encrypted text
     */
    public static String caesarEncrypt(String text, int shift) {
        return null; // TODO
    }

    /**
     * Decrypts a text that was encrypted with caesarEncrypt.
     * @param text the text to decrypt
     * @param shift the shift that was used to encrypt it, from 0 to 25
     * @return the decrypted text
     */
    public static String caesarDecrypt(String text, int shift) {
        return null; // TODO
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
}
