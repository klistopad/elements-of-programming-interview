package prog.interview.ch9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackImplTest {

    @Test
    void push_AllCases() {
        Stack<Integer> stack = new StackImpl<>();
        Assertions.assertNull(stack.max());

        stack.push(1);
        Assertions.assertEquals(1, stack.max());

        stack.push(7);
        stack.push(5);
        Assertions.assertEquals(7, stack.max());

        stack.pop();
        stack.pop();
        Assertions.assertEquals(1, stack.max());
    }
}