package prog.interview.ch9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ch92Test {

    @Test
    void evaluateExpression_21() {
        Assertions.assertEquals(21, new Ch92().evaluateExpression(List.of("1", "2", "+", "3", "4", "+", "*")));
    }

    @Test
    void evaluateExpression_11() {
        Assertions.assertEquals(11, new Ch92().evaluateExpression(List.of("1", "2", "3", "*", "4", "+", "+")));
    }

    @Test
    void evaluateExpression_15() {
        Assertions.assertEquals(15, new Ch92().evaluateExpression(List.of("1", "2", "3", "4", "+", "*", "+")));
    }

    @Test
    void evaluateExpression_40() {
        Assertions.assertEquals(40, new Ch92().evaluateExpression(List.of("3", "5", "+", "7", "2", "-", "*")));
    }
}