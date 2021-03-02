import models.BinOps;

public class Main {
    public static void main(String[] args) {
        String a = "100";
        String b = "10";
        System.out.println("Суммирование: " + BinOps.sum(a, b));
        System.out.println("Умножение: " + BinOps.mult(a, b));

    }
}
