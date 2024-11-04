package prog.interview.ch5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ch51Test {

    @Test
    void isPared_whenWordIsPared() {
        Assertions.assertEquals(0, new Ch51().isPared(3L));
    }

    @Test
    void isPared_whenWordIsNotPared() {
        Assertions.assertEquals(1, new Ch51().isPared(1L));
    }

    @Test
    void isParedV2_whenWordIsPared() {
        Assertions.assertEquals(0, new Ch51().isParedV2(3L));
    }

    @Test
    void isParedV2_whenWordIsNotPared() {
        Assertions.assertEquals(1, new Ch51().isParedV2(1L));
    }

    @Test
    void isParedV3_whenWordIsPared() {
        Assertions.assertEquals(0, new Ch51().isParedV3(0x1001011101L));
    }

    @Test
    void isParedV3_whenWordIsNotPared() {
        Assertions.assertEquals(1, new Ch51().isParedV3(1L));
    }



}