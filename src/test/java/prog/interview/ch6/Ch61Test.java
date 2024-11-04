package prog.interview.ch6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch61Test {

    @Test
    void rearrange_pivot0() {
        Assertions.assertArrayEquals(new int[] {0, 0, 2, 1, 2,1, 1}, new Ch61().rearrange(new int[] {0,1,2,0,2,1,1}, 3));
    }

    @Test
    void rearrange_pivot1() {
        Assertions.assertArrayEquals(new int[] {0, 0, 1, 1, 1,2, 2}, new Ch61().rearrange(new int[] {0,1,2,0,2,1,1}, 1));
    }

    @Test
    void rearrange_pivot2() {
        Assertions.assertArrayEquals(new int[] {0, 1, 0, 1, 1,2, 2, 5}, new Ch61().rearrange(new int[] {0,1,5,2,0,2,1,1}, 3));
    }
}