public class Zadanie2C {
    public static double heronSquareRoot(double x, int N, double guess, int iteration) {
        if (x < 0) {
            throw new IllegalArgumentException("Liczba musi być większa lub równa 0.");
        }

        if (iteration >= N) {
            return guess;
        } else {
            return heronSquareRoot(x, N, 0.5 * (guess + x / guess), iteration + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Pierwiastek kwadratowy z " + 16.0 + " po " + 10 + " krokach wynosi: " + heronSquareRoot(16.0, 10, 16.0, 0));
    }
}