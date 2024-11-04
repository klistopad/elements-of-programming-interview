package prog.interview.ch5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch52Test {

    @Test
    void swap_whenNeedToSwap() {
        Assertions.assertEquals(0b00001011, new Ch52().swap(0b01001001, 1, 6));
    }

    @Test
    void swap_whenNoNeedToSwap() {
        Assertions.assertEquals(0b01001001, new Ch52().swap(0b01001001, 1, 7));
    }
}