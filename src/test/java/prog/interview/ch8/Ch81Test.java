package prog.interview.ch8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ch81Test {

    @Test
    void merge() {
        Assertions.assertEquals(List.of(2, 3, 5, 7, 11), new Ch81().merge(List.of(2, 5, 7), List.of(3, 11)));
    }
}