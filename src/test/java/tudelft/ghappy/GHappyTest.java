package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void twoLettersMiddle() {
        GHappy test = new GHappy();
        boolean result = test.gHappy("hhgghh");
        Assertions.assertTrue(test.gHappy("hhgghh"));

    }

    @Test
    public void twoLettersStart() {
        GHappy test = new GHappy();
        boolean result = test.gHappy("gghh");
        Assertions.assertTrue(test.gHappy("gghh"));
    }

    @Test
    public void twoLettersEnd() {
        GHappy test = new GHappy();
        boolean result = test.gHappy("hhjjgg");
        Assertions.assertTrue(test.gHappy("hhjjgg"));
    }

    @Test
    public void twoLettersOneBig() {
        GHappy test = new GHappy();
        boolean result = test.gHappy("hhGg");
        Assertions.assertTrue(test.gHappy("hhGg"));
    }
}