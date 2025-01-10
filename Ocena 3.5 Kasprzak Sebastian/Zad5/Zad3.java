package prod.func.Zad5;

import java.util.function.Function;

public class Zad3 {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> inc = x -> x + 1;

        Function<Integer, Integer> composed = compose(square, inc);
        System.out.println(composed.apply(6));
    }
    public static <T> Function<T, T> compose(Function<T, T> f, Function<T, T> g) {
        return x -> f.apply(composeHelper(g, x));
    }
    private static <T> T composeHelper(Function<T, T> g, T x) {
        return g.apply(x);
    }
}
