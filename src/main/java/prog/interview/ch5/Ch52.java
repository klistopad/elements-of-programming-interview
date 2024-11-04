package prog.interview.ch5;

public class Ch52 {

    public long swap(long val, int i, int j){
        System.out.println("val:         " + Long.toBinaryString(val));
        System.out.println("i: " + i);
        System.out.println("j: " + j);

        if (((val >>> i) & 1) == ((val >>> j) & 1)){
            System.out.println("no need to swap");
            return val;
        }

        long bitMask = (1L << i) | (1L << j);
        System.out.println("bitMask: " + Long.toBinaryString(bitMask));


        val ^= bitMask;
        System.out.println("swapped val: " + Long.toBinaryString(val));
        return val;
    }
}
