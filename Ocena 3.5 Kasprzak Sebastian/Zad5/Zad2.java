package prod.func.Zad5;

public class Zad2 {
    public static void main(String[] args) {
        System.out.println("Cube root of 27 with Newton's method is: " + cubeRoot(27, 0.0001));
    }

    public static double cubeRoot(double x, double epsilon) {
        return cubeRootRecursive(x, epsilon, x / 3.0);
    }

    private static double cubeRootRecursive(double x, double epsilon, double guess) {
        return ((((guess * guess * guess - x) < 0.0)
            ? -(guess * guess * guess - x)
            : (guess * guess * guess - x) ) < epsilon)
                ? guess
                : cubeRootRecursive(x, epsilon, (2 * guess + x / (guess * guess)) / 3.0);
    }
}
