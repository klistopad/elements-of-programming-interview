package prog.interview.ch20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch202Test {

    @Test
    void incrementConcurrently() throws Exception {
        Assertions.assertEquals(2_000_000, new Ch202().incrementConcurrently(1_000_000));
    }
}