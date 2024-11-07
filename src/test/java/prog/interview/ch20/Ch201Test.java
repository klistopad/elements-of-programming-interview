package prog.interview.ch20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch201Test {

    @Test
    void findSuggestedWordsTest(){
        Assertions.assertArrayEquals(new String[]{"word1", "word2"}, new Ch201.SpellCheckService().findSuggestedWords("word"));
    }

}