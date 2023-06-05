public class NumberConversion {

    public static String dec2Bin(int n) {
        if (n == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n = n / 2;
        }

        return binary.toString();
    }

    public static int bin2Dec(String n) {
        int decimal = 0;
        int power = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            int bit = Character.getNumericValue(n.charAt(i));
            decimal += bit * Math.pow(2, power);
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println("DEC2BIN:");
        System.out.println("65 -> " + dec2Bin(65));
        System.out.println("100 -> " + dec2Bin(100));
        System.out.println("5 -> " + dec2Bin(5));
        System.out.println("25 -> " + dec2Bin(25));
        System.out.println("10 -> " + dec2Bin(10));

        System.out.println("\nBIN2DEC:");
        System.out.println("1111 -> " + bin2Dec("1111"));
        System.out.println("10001 -> " + bin2Dec("10001"));
        System.out.println("1010 -> " + bin2Dec("1010"));
        System.out.println("11011 -> " + bin2Dec("11011"));
        System.out.println("100 -> " + bin2Dec("100"));
    }
}
