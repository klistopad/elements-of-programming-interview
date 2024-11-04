package prog.interview.ch17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch172Test {

    @Test
    void findWordDistance() {
        Assertions.assertEquals(5, new Ch172().findWordDistance("Saturday", "Sundays"));
        Assertions.assertEquals(3, new Ch172().findWordDistance("preSaturday", "Saturday"));
        Assertions.assertEquals(6, new Ch172().findWordDistance("preSaturday", "Saturdais"));
    }
}