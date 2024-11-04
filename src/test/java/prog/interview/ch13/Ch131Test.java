package prog.interview.ch13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch131Test {

    @Test
    void checkPalindrome() {
        Assertions.assertTrue(new Ch131().checkPalindrome("r"));
        Assertions.assertTrue(new Ch131().checkPalindrome("rotator"));
        Assertions.assertTrue(new Ch131().checkPalindrome("rottor"));
        Assertions.assertTrue(new Ch131().checkPalindrome("edified"));
        Assertions.assertFalse(new Ch131().checkPalindrome("edifiedg"));

    }
}