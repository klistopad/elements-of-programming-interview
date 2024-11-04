package prog.interview.ch17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch173Test {

    @Test
    void findWaysCount() {
        Assertions.assertEquals(70, new Ch173().findWaysCount(5));
    }
}