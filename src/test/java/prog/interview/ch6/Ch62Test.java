package prog.interview.ch6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Ch62Test {

    @Test
    void increment() {
        Assertions.assertArrayEquals(new int[]{1,3,0}, new Ch62().increment(new int[]{1,2,9}));
    }

    @Test
    void increment_all() {
        Assertions.assertEquals(List.of(1,0,0,0), new Ch62().incrementV2(new ArrayList<>(List.of(9,9,9))));
    }
}