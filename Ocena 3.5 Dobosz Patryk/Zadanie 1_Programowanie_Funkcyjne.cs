using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Euler6
{
    using System;

    public class Euler6
    {
        public static void Main()
        {
            int n = 100;
            int sumOfSquares = Enumerable.Range(1, n).Select(x => x * x).Sum(); //Generujemy sekwencję liczb  1-100,ponosimy je do kwadratu,po czym sumujemy
            int squareOfSum = (int)Math.Pow(Enumerable.Range(1, n).Sum(), 2); //Tutaj podnosimy sumę kwadratów liczb 1-100, po czym je sumujemy
            int result =sumOfSquares - squareOfSum; //Obliczamy różnicę pomiędzy kwadratem sumy, a sumą kwadratów
            Console.WriteLine(result);
        }
    }

}
