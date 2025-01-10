// Zadanie 2.
// a. Wzór na pierwiastek sześcienny - zaimplementować
// b. Przebieg procedury Herona uzależnić od Epsilon
// c. Przebieg procedury Herona uzależnić od N (ilości kroków)



package com.example;

public class Main {
    public static void main(String[] args) {

        double x = 20.0;
        double epsilon = 0.001;
        int N = 100;

        double cubeRoot = cubeRoot(x);
        System.out.println("Pierwiastek sześcienny z " + x + " wynosi: " + cubeRoot);

        double sqrtE = heronERoot(x, epsilon);
        System.out.println("Pierwiastek kwadratowy z " + x + " i Epsilonem równym " + epsilon + " wynosi: " + sqrtE);

        double sqrtI = heronIRoot(x, N);
        System.out.println("Pierwiastek kwadratowy z " + x + " po " + N + " krokach wynosi: " + sqrtI);
    }

    public static double cubeRoot(double x) {
        return Math.cbrt(x);
    }

    public static double heronERoot(double x, double epsilon) {
        double guess = x;
        while (Math.abs(guess * guess - x) > epsilon) {
            guess = (guess + x / guess) / 2.0;
        }
        return guess;
    }

    public static double heronIRoot(double x, int N) {
        double guess = x;
        for (int i = 0; i < N; i++) {
            guess = (guess + x / guess) / 2.0;
        }
        return guess;
    }
}