package prog.interview.ch17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ch171Test {

    @Test
    void findScoreCombinationsCount() {
        Assertions.assertEquals(18, new Ch171().findScoreCombinationsCount(12, List.of(2,3,7)));
    }
}