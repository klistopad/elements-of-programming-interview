package prog.interview.ch13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

class Ch133Test {

    @Test
    void lruTest(){
        Ch133.LRUCache<String, Integer> cache = new Ch133.LRUCache<>(2);
        cache.put("1", 1);
        cache.put("2", 2);

        System.out.println(cache);
        Assertions.assertEquals(Map.of("1", 1, "2", 2), cache);

        cache.get("1");

        System.out.println(cache);
        Assertions.assertEquals(Map.of("2", 2, "1", 1), cache);
    }

}