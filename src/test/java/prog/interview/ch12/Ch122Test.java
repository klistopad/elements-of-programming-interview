package prog.interview.ch12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ch122Test {

    @Test
    void findIndexes() {
        List<Integer> list = List.of(-2, 0, 2, 3, 6, 7, 9);

        Assertions.assertEquals(List.of(2, 3), new Ch122().findIndexes(list));
    }
}