using System.Numerics;

class Program
{
    static BigInteger LiczenieLiczbyFibonacciego(int n)
    {
        return LiczenieLiczbyFibonacciego(n, 0, 1);
    }

    static BigInteger LiczenieLiczbyFibonacciego(int n, BigInteger a, BigInteger b)
    {
        if (n == 0) return a;
        if (n == 1) return b;
        return LiczenieLiczbyFibonacciego(n - 1, b, a + b);
    }

    static void Main(string[] args)
    {
        int n = 10000; //Dla 10000 stackoverflow
        BigInteger wynik = LiczenieLiczbyFibonacciego(n);
        Console.WriteLine($"Dla ciągu Fibonacciego n = {n} Wynik = {wynik}");
    }
}