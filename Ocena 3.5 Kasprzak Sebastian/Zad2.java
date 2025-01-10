package prod.func;

public class Zad2 {
    public static void main(String[] args) 
    {
        System.out.println("Cube root of 27 is: " + cubeRoot27());
        System.out.println("Cube root of 27 with epsilon 0.0001 is: " + cubeRoot27WithEpsilon());
        System.out.println("Cube root of 27 after 10 steps is: " + cubeRoot27WithSteps());
    }

    public static double cubeRoot27() {
        return cubeRoot(27, 1, 27);
    }

    public static double cubeRoot27WithEpsilon() {
        return cubeRootWithEpsilon(27, 0.0001, 27 / 3.0);
    }

    public static double cubeRootWithEpsilon(double x, double epsilon, double guess) {
        return (
                (((guess * guess * guess - x) < 0.0)
                    ? -(guess * guess * guess - x)
                    : (guess * guess * guess - x)) < epsilon)
                        ? guess
                        : cubeRootWithEpsilon(x, epsilon, (2 * guess + x / (guess * guess)) / 3.0);
    }

    public static double cubeRoot27WithSteps() {
        return cubeRootWithSteps(27, 10, 27 / 3.0);
    }

    public static double cubeRootWithSteps(double x, int steps, double guess) {
        return (steps == 0)
                ? guess
                : cubeRootWithSteps(x, steps - 1, (2 * guess + x / (guess * guess)) / 3.0);
    }
    public static int cubeRoot(int n, int low, int high) {
        if (low > high) {
            return high;
        }

        if (((low + high) / 2) == n) {
            return ((low + high) / 2);
        } else if ((((low + high) / 2) * ((low + high) / 2) * ((low + high) / 2)) < n) {
            return cubeRoot(n, ((low + high) / 2) + 1, high);
        } else {
            return cubeRoot(n, low, ((low + high) / 2) - 1);
        }
    }
}
