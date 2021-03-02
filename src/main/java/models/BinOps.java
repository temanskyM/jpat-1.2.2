package models;

public class BinOps {
    public static String sum(String a, String b) {
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int result = intA + intB;
        return Integer.toBinaryString(result);
    }

    public static String mult(String a, String b) {
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int result = intA * intB;
        return Integer.toBinaryString(result);
    }
}
