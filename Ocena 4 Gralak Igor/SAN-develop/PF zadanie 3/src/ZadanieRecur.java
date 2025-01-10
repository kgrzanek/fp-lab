public class ZadanieRecur {
    public static long fib(int n) {
        return fibHelper(n, 0, 1);
    }

    private static long fibHelper(int n, long a, long b) {
        if (n == 0) {
            return a;
        } else if (n == 1) {
            return b;
        } else {
            return fibHelper(n - 1, b, a + b);
        }
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci(" + 10 + ") = " + fib(10));
    }
}
