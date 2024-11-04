package prog.interview.ch11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class Ch111Test {

    @Test
    void mergeSortedSources() {
        List<Iterator<Integer>> input = List.of(
                List.of(3,5,7).iterator(),
                List.of(0,6).iterator(),
                List.of(0,6,28).iterator()
        );

        Assertions.assertEquals(List.of(0,0,3,5,6,6,7,28), new Ch111().mergeSortedSources(input));
    }
}