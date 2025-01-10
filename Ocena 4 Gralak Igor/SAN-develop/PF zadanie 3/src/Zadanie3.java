import java.math.BigInteger;

public class Zadanie3 {
    public static BigInteger fib(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }

        return b;
    }

    public static void main(String[] args) {
        int n = 10;
        BigInteger result = fib(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}