package prog.interview.ch12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ch121Test {

    @Test
    void binarySearch() {

        List<Integer> list = List.of(-14, -10, 2, 108, 108, 243, 285, 285, 285, 401);

        Assertions.assertEquals(3, new Ch121().binarySearch(list, 108));

        Assertions.assertEquals(6, new Ch121().binarySearch(list, 285));

        Assertions.assertEquals(-11, new Ch121().binarySearch(list, 500));

    }
}