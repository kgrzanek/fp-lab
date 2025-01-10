using System.Numerics;
class Program
{
    static BigInteger LiczenieLiczbyFibonacciego(int n)
    {
        if (n <= 1) return n;

        BigInteger a = 0;
        BigInteger b = 1;

        for (int i = 2; i <= n; i++)
        {
            BigInteger temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }
    static void Main(string[] args)
    {
        int n = 10000; // Przykładowa duża liczba
        BigInteger wynik = LiczenieLiczbyFibonacciego(n);
        Console.WriteLine($"Dla ciągu Fibonacciego n = {n} Wynik = {wynik}");
    }
}

