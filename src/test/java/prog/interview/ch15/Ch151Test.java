package prog.interview.ch15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class Ch151Test {

    @Test
    void isValidBST() {
        NavigableSet<Integer> set = new TreeSet<>(List.of(1, 2, 3, 4, 9, 12, 44, 4));

        Assertions.assertTrue(new Ch151().isValidBST(set));
    }
}