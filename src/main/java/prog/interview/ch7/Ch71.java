package prog.interview.ch7;

public class Ch71 {
    public Integer parse(String s) {
        Integer res = 0;
        for (int i = s.length() - 1; i > -1; i--){
            if (s.charAt(i) == '-'){
                res *= -1;
            } else {
                int digit = toIntegerDigit(s.charAt(i));
                digit *= (int) Math.round(Math.pow(10, (s.length() - 1 - i)));
                res += digit;
            }
        }
        return res;
    }

    public String valueOf(Integer val){
        int abcVal = Math.abs(val);

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= abcVal; i *= 10){
            Integer tmp1 = abcVal / i;
            Integer tmp2 = abcVal / (i * 10) * 10;
            Integer digit = tmp1 - tmp2;
            Character charDigit = toCharDigit(digit);
            builder.append(charDigit);
        }
        if (val < 0) {
            builder.append('-');
        }
        builder.reverse();
        return builder.toString();
    }

    private Character toCharDigit(Integer digit){
        return switch (digit){
            case 0 -> '0';
            case 1 -> '1';
            case 2 -> '2';
            case 3 -> '3';
            case 4 -> '4';
            case 5 -> '5';
            case 6 -> '6';
            case 7 -> '7';
            case 8 -> '8';
            case 9 -> '9';
            default -> throw new RuntimeException();
        };
    }

    private Integer toIntegerDigit(Character digit){
        return switch (digit){
            case '0' -> 0;
            case '1' -> 1;
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            case '5' -> 5;
            case '6' -> 6;
            case '7' -> 7;
            case '8' -> 8;
            case '9' -> 9;
            default -> throw new RuntimeException();
        };
    }

    private String toBinaryString(Integer val){
        return String.format("%32s", Integer.toBinaryString(val)).replace(' ', '0');
    }
}

//        System.out.println("1:   " + toBinaryString(1) );
//        System.out.println("0:   " + toBinaryString(0) );
//        System.out.println("-1:  " + toBinaryString(-1) );
//        System.out.println("max: " + toBinaryString(Integer.MAX_VALUE) );
//        System.out.println("min: " + toBinaryString(Integer.MIN_VALUE) );
