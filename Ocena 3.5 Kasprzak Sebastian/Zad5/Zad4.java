package prod.func.Zad5;

import java.util.function.Function;

public class Zad4 {
    public static void main(String[] args) {
        Function<Integer, Integer> inc = x -> x + 1;
        Function<Integer, Integer> nComposed = nCompose(inc, 5);

        System.out.println(nComposed.apply(10));
    }

    public static <T> Function<T, T> nCompose(Function<T, T> f, int n) {
        return (n == 0) ? Function.identity() : compose(f, nCompose(f, n - 1));
    }

    public static <T> Function<T, T> compose(Function<T, T> f, Function<T, T> g) {
        return x -> f.apply(g.apply(x));
    }
}
