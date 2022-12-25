package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.roman.RomanNumeral;

public class CaesarShiftCipherTest {

    @Test
    public void shiftStartLetters() {
        CaesarShiftCipher test = new CaesarShiftCipher();
        String result = test.CaesarShiftCipher("abc", 3);
        Assertions.assertEquals("def", result);
    }

    @Test
    public void shiftEndLetters() {
        CaesarShiftCipher test = new CaesarShiftCipher();
        String result = test.CaesarShiftCipher("xyz", 3);
        Assertions.assertEquals("abc", result);
    }

    @Test
    public void shiftStartLettersNeg() {
        CaesarShiftCipher test = new CaesarShiftCipher();
        String result = test.CaesarShiftCipher("abc", -3);
        Assertions.assertEquals("xyz", result);
    }

    @Test
    public void shiftEndLettersNeg() {
        CaesarShiftCipher test = new CaesarShiftCipher();
        String result = test.CaesarShiftCipher("xyz", -3);
        Assertions.assertEquals("uvw", result);
    }
}
