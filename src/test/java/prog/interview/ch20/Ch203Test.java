package prog.interview.ch20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ch203Test {

    @Test
    void printVals() throws Exception {
        Assertions.assertTrue(new Ch203(100).printVals());
    }
}