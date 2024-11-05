package prog.interview.ch18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ch182Test {

    @Test
    void findMinWaitingTime() {
        Assertions.assertEquals(10, new Ch182().findMinWaitingTime(List.of(2, 5, 1, 3)));
    }
}