public class Zadanie1 {
    public static void main(String[] args) {
        System.out.println("Difference: " + (getSquareOfSum(100) - getSumOfSquares(100, 1)));
    }

    public static long getSumOfSquares(int n, int current) {
        if (current > n) {
            return 0;
        } else {
            return current * current + getSumOfSquares(n, current + 1);
        }
    }

    public static long getSquareOfSum(int n) {
        return (long) Math.pow(getSum(1, n), 2);
    }

    public static long getSum(int current, int n) {
        if (current > n) {
            return 0;
        } else {
            return current + getSum(current + 1, n);
        }
    }
}