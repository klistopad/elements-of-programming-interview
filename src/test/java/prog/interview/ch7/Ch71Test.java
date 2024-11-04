package prog.interview.ch7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch71Test {

    @Test
    void parse_whenPositiveNoZeros() {
        Assertions.assertEquals(123456, new Ch71().parse("123456"));
    }

    @Test
    void parse_whenPositiveWithZeros() {
        Assertions.assertEquals(12345060, new Ch71().parse("12345060"));
    }

    @Test
    void parse_whenNegative() {
        Assertions.assertEquals(-123456, new Ch71().parse("-123456"));
    }

    @Test
    void valueOf_whenPositiveNoZeros() {
        Assertions.assertEquals("123456", new Ch71().valueOf(123456));
    }

    @Test
    void valueOf_whenPositiveWithZeros() {
        Assertions.assertEquals("12345060", new Ch71().valueOf(12345060));
    }

    @Test
    void valueOf_whenNegative() {
        Assertions.assertEquals("-123456", new Ch71().valueOf(-123456));
    }
}