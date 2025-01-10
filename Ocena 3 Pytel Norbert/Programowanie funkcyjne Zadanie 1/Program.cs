class Program
{
    static int RozwiazanieFunkcyjne()
    {
        return Enumerable.Range(1, 100).Sum() * Enumerable.Range(1, 100).Sum() - Enumerable.Range(1, 100).Sum(i => i * i);
    }
        
    static void Main(string[] args)
    {
        Console.WriteLine($"Wynik: {RozwiazanieFunkcyjne()}");
    }
}
