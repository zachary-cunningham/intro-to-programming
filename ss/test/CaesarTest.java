//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import ss.SecretMessages;
//
///**
// * Tests the Caesar cipher of SecretMessages.
// */
//public class CaesarTest {
//    @Test
//    void shiftLetterTest() {
//        assertEquals('d', SecretMessages.shiftLetter('a', 3));
//        assertEquals('D', SecretMessages.shiftLetter('A', 3));
//        assertEquals('b', SecretMessages.shiftLetter('y', 3));
//        assertEquals('!', SecretMessages.shiftLetter('!', 3));
//    }
//
//    @Test
//    void encryptTest() {
//        assertEquals("Khoor, Zruog!",
//                     SecretMessages.caesarEncrypt("Hello, World!", 3));
//        assertEquals("abc ABC", SecretMessages.caesarEncrypt("xyz XYZ", 3));
//        assertEquals("123 !?, #", SecretMessages.caesarEncrypt("123 !?, #", 5));
//        // the letter e with an accent stays the same
//        assertEquals("fdi\u00e9", SecretMessages.caesarEncrypt("caf\u00e9", 3));
//        assertEquals("", SecretMessages.caesarEncrypt("", 3));
//    }
//
//    @Test
//    void decryptTest() {
//        assertEquals("Hello, World!",
//                     SecretMessages.caesarDecrypt("Khoor, Zruog!", 3));
//        assertEquals("xyz XYZ", SecretMessages.caesarDecrypt("abc ABC", 3));
//        assertEquals("Same", SecretMessages.caesarDecrypt("Same", 0));
//    }
//}
