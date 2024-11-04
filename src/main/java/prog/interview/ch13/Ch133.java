package prog.interview.ch13;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ch133 {

    public static class LRUCache<K, V> extends LinkedHashMap<K, V>{
        private final int capacity;

        public LRUCache(int capacity) {
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > this.capacity;
        }
    }
}
