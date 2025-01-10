package zadanie3fun;
import java.math.BigInteger;

public class Zadanie3fun {

    public static void main(String[] args) {
        int n = 10;
        int largeN = 10000;

        FibonacciCalculator tailRecursiveCalculator = (num) -> BigInteger.valueOf(fibTailRecursive(num));
        FibonacciCalculator iterativeCalculator = Zadanie3fun::fibIterative;
        FibonacciCounterSteps stepsCounter = Zadanie3fun::countSteps;

        long steps = stepsCounter.count(n);
        BigInteger generatedFib = tailRecursiveCalculator.calculate(n);
        BigInteger iterativeFib = iterativeCalculator.calculate(largeN);

        System.out.println("Liczba krokow potrzebna do obliczenia fib(" + n + ") rekurencyjnie: " + steps);
        System.out.println("Wartosc jaka przyjmuje ciag Fibonacciego dla " + n + " wyrazu wynosi: " + generatedFib);
        System.out.println("Wartosc jaka przyjmuje ciag Fibonacciego dla f(" + largeN + ") wyrazu wynosi: " + iterativeFib);
    }
    
    // Metoda rekurencyjna, która generuje proces iteracyjny
    private static long fibTailRecursive(int n) {
        return fibHelper(0, 1, n);
    }
    
    private static long fibHelper(long a, long b, int n) {
        if (n == 0) return a;
        if (n == 1) return b;
        return fibHelper(b, a + b, n - 1);
    }    

    private static BigInteger fibIterative(int n) {
        if (n <= 1) return BigInteger.valueOf(n);
        BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            BigInteger temp = b;
            b = a.add(b);
            a = temp;
        }
        return b;
    }

    private static long countSteps(int n) {
        if (n <= 1) {
            return 1;  // Jeden krok dla n == 0 lub n == 1
        }        
        return (n - 1) + (n - 2) + 1;
    }
}
