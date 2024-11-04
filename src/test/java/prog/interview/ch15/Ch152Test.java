package prog.interview.ch15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class Ch152Test {

    @Test
    void findGreater() {
        NavigableSet<Integer> set = new TreeSet<>(List.of(1, 2, 3, 4, 9, 12, 44));

        Assertions.assertEquals(12, new Ch152().findGreater(set, 9));
    }
}