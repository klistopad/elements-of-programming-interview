package prog.interview.ch14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ch142Test {

    @Test
    void merge() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(13);
        list1.add(17);
        list1.add(null);
        list1.add(null);
        list1.add(null);
        list1.add(null);
        list1.add(null);

        List<Integer> list2 = List.of(3, 7, 11, 19);

        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(11);
        expected.add(13);
        expected.add(17);
        expected.add(19);
        expected.add(null);

        Assertions.assertEquals(expected, new Ch142().merge(list1, list2));
    }
}