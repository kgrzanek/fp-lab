public class Zadanie2B {
    public static double heronSquareRoot(double x, double epsilon, double guess, int iteration) {
        if (x < 0) {
            throw new IllegalArgumentException("Liczba musi być większa lub równa 0.");
        }

        if (Math.abs(guess * guess - x) <= epsilon) {
            System.out.println("Liczba iteracji: " + iteration);
            return guess;
        } else {
            return heronSquareRoot(x, epsilon, 0.5 * (guess + x / guess), iteration + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Pierwiastek kwadratowy z " + 16.0 + " wynosi: " + heronSquareRoot(16.0, 0.0001, 16.0, 0));
    }
}