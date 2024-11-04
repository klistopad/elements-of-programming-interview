package prog.interview.ch13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch132Test {

    @Test
    void isWritable() {
        Assertions.assertTrue(new Ch132().isWritable("abc", "abc"));
        Assertions.assertTrue(new Ch132().isWritable("abc", "abcd"));
        Assertions.assertFalse(new Ch132().isWritable("abc", "abd"));
    }
}