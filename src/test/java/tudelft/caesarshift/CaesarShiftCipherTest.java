package tudelft.caesarshift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static tudelft.caesarshift.CaesarShiftCipher.caesarShiftCipher;

public class CaesarShiftCipherTest {

    @Test
    void positive() {
        assertEquals("def", caesarShiftCipher("abc", 3));
        assertEquals("abc", caesarShiftCipher("xyz", 3));
    }

    @Test
    void negative() {
        assertEquals("abc", caesarShiftCipher("def", -3));
        assertEquals("xyz", caesarShiftCipher("abc", -3));
    }
}
