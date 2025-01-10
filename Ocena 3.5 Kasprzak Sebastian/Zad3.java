package prod.func;

public class Zad3 {
    public static void main(String[] args) {
        System.out.println("Fib(10000) = " + fibIter(10000));
    }

    public static long fibIter(int n) {
        return fibHelper(n, 0, 1);
    }

    public static long fibHelper(int n, long a, long b) {
        return (n == 0) ? a : (n == 1) ? b : fibHelper(n - 1, b, a + b);
    }
}
