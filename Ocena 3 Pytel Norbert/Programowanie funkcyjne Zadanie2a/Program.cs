using System;

public class Program
{
    public static void Main()
    {
        const int x = 3;
        Console.WriteLine($"fib({x}) = {Fib(x)}");
        Console.WriteLine($"Liczba kroków: {FibLiczbaKrokow(x)}");
    }

    public static int Fib(int n)
    {
        if (n <= 1)
            return n;
        else
            return Fib(n - 1) + Fib(n - 2);
    }

    public static int FibLiczbaKrokow(int n)
    {
        if (n <= 1)
            return 1; 

        return FibLiczbaKrokow(n - 1) + FibLiczbaKrokow(n - 2);
    }
}