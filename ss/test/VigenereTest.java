//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import ss.SecretMessages;
//
///**
// * Tests the Vigenere cipher of SecretMessages.
// */
//public class VigenereTest {
//    @Test
//    void encryptTest() {
//        Assertions.assertEquals("Lxfopv ef rnhr!",
//                     SecretMessages.vigenereEncrypt("Attack at dawn!", "lemon"));
//    }
//
//    @Test
//    void keyRepeatsTest() {
//        // Without the spaces, the letters are encrypted in the same way:
//        // spaces do not use up a letter of the key.
//        assertEquals("LXFOPVEFRNHR",
//                     SecretMessages.vigenereEncrypt("ATTACKATDAWN", "lemon"));
//        assertEquals("bcd", SecretMessages.vigenereEncrypt("abc", "b"));
//    }
//
//    @Test
//    void decryptTest() {
//        assertEquals("Attack at dawn!",
//                     SecretMessages.vigenereDecrypt("Lxfopv ef rnhr!", "lemon"));
//        assertEquals("xyz", SecretMessages.vigenereDecrypt("abc", "d"));
//    }
//}
