package prog.interview.ch7;

public class Ch72 {

    public String convertBase(String val, int baseFrom, int baseTo){
        int decimalVal = toDecimalVal(val, baseFrom);
        String res = toTargetBase(decimalVal, baseTo);
        return res;
    }

    private String toTargetBase(int val, int base){
        int absVal = Math.abs(val);
        StringBuilder builder = new StringBuilder();
        do{
            builder.append(toHex(absVal % base));
            absVal /= base;
        }while(absVal != 0);

        if (val < 0) {
            builder.append('-');
        }

        return builder.reverse().toString();
    }

    private int toDecimalVal(String val, int base){
        int res = 0;
        for (int i = 0; i < val.length(); i++) {
            char charDigit = val.charAt(val.length() - 1 - i);
            if (charDigit == '-'){
                res *= -1;
            } else {
                int digit = toDecimal(charDigit);
                res += digit * (int)Math.round(Math.pow(base, i));
            }
        }
        return res;
    }

    private int toDecimal(char digit){
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
            case 'A' -> 10;
            case 'B' -> 11;
            case 'C' -> 12;
            case 'D' -> 13;
            case 'E' -> 14;
            case 'F' -> 15;
            default -> throw new RuntimeException();
        };
    }

    private char toHex(int digit){
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
            case 10 -> 'A';
            case 11 -> 'B';
            case 12 -> 'C';
            case 13 -> 'D';
            case 14 -> 'E';
            case 15 -> 'F';
            default -> throw new RuntimeException();
        };
    }
}
