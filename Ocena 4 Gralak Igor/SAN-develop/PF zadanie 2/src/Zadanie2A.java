public class Zadanie2A {

    public static int cubeRoot(int n, double precision, int x) {
        if (Math.abs(n - x * x * x) <= precision) {
            return x;
        } else {
            return cubeRoot(n, precision, (2 * x + n / (x * x)) / 3);
        }
    }

    public static void main(String[] args) {
        System.out.println("Cube root of " + 64 + " is approximately: " + cubeRoot(64, 0.0001, 64));
    }
}
