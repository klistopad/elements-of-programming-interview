package prog.interview.ch20;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Ch201 {

    public static class SpellCheckService{
        private static final int CACHE_SIZE = 8;

        private final LinkedHashMap<String, String[]> cache = new LinkedHashMap<>(){
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, String[]> eldest) {
                return size() > CACHE_SIZE;
            }
        };

        private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        public String[] findSuggestedWords(String word){
            String[] words;
            readWriteLock.readLock().lock();
            try {
                words = cache.get(word);
            } finally {
                readWriteLock.readLock().unlock();
            }

            if (words == null) {
                words = findSuggestedWordsByWord(word);
                readWriteLock.writeLock().lock();
                try {
                    cache.put(word, words);
                }finally {
                    readWriteLock.writeLock().unlock();
                }
            }
            return words;
        }

        private String[] findSuggestedWordsByWord(String word) {
            return new String[]{"word1", "word2"};
        }
    }
}
