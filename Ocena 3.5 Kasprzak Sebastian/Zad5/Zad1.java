package prod.func.Zad5;

public class Zad1 {
    public static void main(String[] args) {
        System.out.println("Cube root of 27 with fixed-point method is: " + fixedPoint(27, 0.0001));
    }

    public static double averageDamp(double x) {
        return (x + x / 2.0) / 2.0;
    }

    public static double fixedPoint(double x, double epsilon) {
        return fixedPointRecursive(x, epsilon, x / 3.0);
    }

    private static double fixedPointRecursive(double x, double epsilon, double guess) {
        return ((((guess * guess * guess - x) < 0.0)
            ? -(guess * guess * guess - x)
            : (guess * guess * guess - x) ) < epsilon)
                ? guess
                : fixedPointRecursive(x, epsilon, averageDamp(guess));
    }
}