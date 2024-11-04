package prog.interview.ch7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch72Test {

    @Test
    void convertBase_decimalToHex() {
        Assertions.assertEquals("3B", new Ch72().convertBase("59", 10, 16));
    }

    @Test
    void convertBase_octToHex() {
        Assertions.assertEquals("1B2A", new Ch72().convertBase("15452", 8, 16));
    }

    @Test
    void convertBase_octToHexNegative() {
        Assertions.assertEquals("-1B2A", new Ch72().convertBase("-15452", 8, 16));
    }
}