package zadanie2fun;

public class Zadanie2fun {

    public static void main(String[] args) {
        CubeRoot cubeRoot = (int a) -> Math.cbrt(a);
        System.out.println("Pierwiastkiem szesciennym jest: " + cubeRoot.calculate(27));
        
//        AbsoluteValue absoluteValue = (double a) -> Math.abs(a);
        
        HeronEpsilon heronEpsilon = (a, g, e) -> calculateHeronEpsilon(a, g, e);
        
        System.out.println("Pierwiastkiem obliczonym metoda HeronEpsilon jest: " + heronEpsilon.calculate(27.0, 14.0, 0.0001));
        
        HeronSteps heronSteps = (number, steps) -> calculateHeronSteps(number, steps);
        
        System.out.println("Pierwiastkiem obliczonym metoda HeronSteps jest: " + heronSteps.calculate(27, 5));
    }
    private static double calculateHeronEpsilon(double a, double guess, double epsilon) {
        if (Math.abs(guess * guess - a) > epsilon) {
            double newGuess = (guess + a / guess) / 2.0;
            return calculateHeronEpsilon(a, newGuess, epsilon);
        } else {
            return guess;
        }
    }
    private static double calculateHeronSteps (double number, double steps){
        double guess = number;
        for (int i = 0; i < steps; i++) {
            guess = (guess + number / guess) / 2.0;
        }
        return guess;
    }
}
