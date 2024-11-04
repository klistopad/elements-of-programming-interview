package prog.interview.ch8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class Ch82Test {

    @Test
    void reverseSubList() {
        Assertions.assertEquals(List.of(11,3,5,7,2), new Ch82().reverseSubList(new ArrayList<>(List.of(11,7,5,3,2)), 2, 4));
    }
}