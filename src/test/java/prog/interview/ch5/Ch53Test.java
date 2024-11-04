package prog.interview.ch5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch53Test {

    @Test
    void reverseOrder() {
        Assertions.assertEquals(
                0b1101110101010100000000000000000000000000000000000000000000000000L,
                new Ch53().reverseOrder(0b10101010111011));
    }
}