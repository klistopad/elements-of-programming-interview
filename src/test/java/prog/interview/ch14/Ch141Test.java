package prog.interview.ch14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ch141Test {

    @Test
    void findIntersection() {
        Assertions.assertEquals(List.of(5, 6, 8), new Ch141().findIntersection(
                        List.of(2, 3, 3, 5, 5, 6, 7, 7, 8, 12),
                        List.of(5, 5, 6, 8, 8, 9, 10, 10)));
    }
}