package prog.interview.ch18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ch181Test {

    @Test
    void calculateTimeToCompleteTasks() {
        Assertions.assertEquals(8, new Ch181().calculateTimeToCompleteTasks(List.of(5, 2, 1, 6, 4, 4)));
        Assertions.assertEquals(6, new Ch181().calculateTimeToCompleteTasks(List.of(5, 2, 1, 6, 4)));
    }
}