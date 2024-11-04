package prog.interview.ch11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ch112Test {

    @Test
    void sort() {
         List<Integer> list = List.of(57, 131, 493, 294, 221, 339, 418, 452, 442, 190);

        Assertions.assertEquals(List.of(57, 131, 190, 221, 294, 339, 418, 442, 452, 493), new Ch112().sort(list, 5));
    }
}