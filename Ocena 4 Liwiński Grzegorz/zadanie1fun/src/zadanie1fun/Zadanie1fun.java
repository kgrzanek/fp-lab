package zadanie1fun;

public class Zadanie1fun {

    public static void main(String[] args) {
        
        Square square = number -> (long) number * number;

        SumOfSquares sumOfSquares = () -> {
            return java.util.stream.IntStream.rangeClosed(1, 100)
                                             .map(i -> i * i)
                                             .sum();
        };
        
        System.out.println("Suma kwadratow pierwszych 100 liczb wynosi: " + sumOfSquares.calculate());
        
        SquareOfSum squareOfSum = calculator -> {
            int sum = java.util.stream.IntStream.rangeClosed(1, 100)
                                                .sum();
            return calculator.square(sum);
        };
        
        System.out.println("Kwadrat sumy pierwszych 100 liczb wynosi: " + squareOfSum.calculate(square));
        
        Subtraction subtraction = (long a, long b) -> a - b;
        
        System.out.println("Roznica tych wyrazen wynosi: " + subtraction.calculate(squareOfSum.calculate(square), sumOfSquares.calculate()));
        
    }

    
}
