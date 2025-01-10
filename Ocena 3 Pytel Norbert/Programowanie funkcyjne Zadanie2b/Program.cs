using System;

public class Program
{
    public static void Main()
    {
        const int X = 3;
        Console.WriteLine($"fib({X}) =  {Fib(X)}");
    }

    public static int Fib(int n, int a = 0, int b = 1)
    {
        if (n == 0)
            return a;
        if (n == 1)
            return b;

        return Fib(n - 1, b, a + b);
    }
}
