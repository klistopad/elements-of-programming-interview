package prog.interview.ch5;

public class Ch51 {

    public int isPared(long word){
        int bitCount = Long.bitCount(word);
        return bitCount % 2;
    }

    public int isParedV2(long word){
        long res = 0;
        while (word != 0){
            res ^= word & 1;
            word >>>= 1;
        }
        return (int) res;
    }

    public int isParedV3(long word){
        int res = 0;

        while (word != 0){
            res ^= 1;
            System.out.println("word:         " + Long.toBinaryString(word));
            System.out.println("word - 1:     " + Long.toBinaryString(word - 1));
            System.out.println("~(word - 1):  " + Long.toBinaryString(~(word - 1)));
            System.out.println("&~(word - 1): " + Long.toBinaryString(word &~(word - 1)));



            word &= (word - 1);
        }
        return res;
    }










}
