class Program
{
    static double PierwiastekSzescienny(double x)
    {
        return Math.Pow(x, 1.0 / 3.0);
    }
    static double Heron(double przyblizenie, double x, double epsilon)
    {
        if (Math.Abs(przyblizenie * przyblizenie * przyblizenie - x) < epsilon)
        {
            return przyblizenie;
        }
        else
        {
            return Heron((2 * przyblizenie + x / (przyblizenie * przyblizenie)) / 3, x, epsilon);
        }
    }
    static double PierwiastekHeronaEpsilon(double x, double epsilon)
    {
        return Heron(x / 2, x, epsilon);
    }

    static double HeronN(double przyblizenie, double x, int N)
    {
        if (N == 0)
        {
            return przyblizenie;
        }
        else
        {
            return HeronN((2 * przyblizenie + x / (przyblizenie * przyblizenie)) / 3, x, N - 1);
        }
    }
    static double PierwiastekHeronaN(double x, int N)
    {
        return HeronN(x / 2, x, N);
    }

    static void Main(string[] args)
    {
        Console.WriteLine("Pierwiastek sześcienny z {0} (Wzór): {1}", 125, PierwiastekSzescienny(125));

        Console.WriteLine("Pierwiastek sześcienny z {0} (Herona - Epsilon): {1}", 125, PierwiastekHeronaEpsilon(125, 0.0001));

        Console.WriteLine("Pierwiastek sześcienny z {0} (Herona - N): {1}", 125, PierwiastekHeronaN(125, 10));
    }
}

