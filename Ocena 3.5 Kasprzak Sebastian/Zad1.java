package prod.func;

public class Zad1 {
    public static void main(String[] args) 
    {
        System.out.println("Difference: " + (squareOfSum(100) - sumOfSquares(100)));
    }

    public static int sumOfSquares(int n) {
        return (n == 1) ? 1 : n * n + sumOfSquares(n - 1);
    }

    public static int squareOfSum(int n) {
        return sum(n) * sum(n);
    }

    public static int sum(int n) {
        return (n == 1) ? 1 : n + sum(n - 1);
    }
}
