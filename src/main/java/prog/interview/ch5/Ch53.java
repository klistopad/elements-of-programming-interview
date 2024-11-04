package prog.interview.ch5;

public class Ch53 {

    public long reverseOrder(long val){
        System.out.println("val         : " + Long.toBinaryString(val));

        for (int i = 0, j = 63; i < 32; i++, j--){
            if (((val >>> i) & 1L) != ((val >>> j) & 1L)) {
                long bitMask = (1L << i) | (1L << j);
                val ^= bitMask;
            }
        }
        System.out.println("reversed val: " + Long.toBinaryString(val));
        return val;
    }
}
