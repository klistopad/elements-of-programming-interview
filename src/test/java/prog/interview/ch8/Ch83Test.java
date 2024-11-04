package prog.interview.ch8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ch83Test {

    @Test
    void hasCyclicity_whenNoCyclicity() {
        Assertions.assertNull(new Ch83().hasCyclicity(List.of(1,2,3,4,5,6)));
    }

    @Test
    void hasCyclicity_whenCyclicityPresents() {
        Assertions.assertEquals(1,new Ch83().hasCyclicity(List.of(1,2,3,4,2,6)));
    }
}