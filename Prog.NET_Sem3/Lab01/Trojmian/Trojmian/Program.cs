using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace Trojmian
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Podaj A:");
            double A =  Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Podaj B:");
            double B = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Podaj C:");
            double C = Convert.ToDouble(Console.ReadLine());
            double Delta = (B * B) - (4 * A * C);
            if (Delta < 0)
            {
                Console.WriteLine("Delta: " + Delta);
                Console.WriteLine("Delta ujemna brak wyników");
            } else if(Delta == 0)
            {
                double pierw = (-B + Math.Sqrt(Delta)) / (2 * A);
                Console.WriteLine("Delta równa 0: ");
                Console.WriteLine("Pierwiastek 1: " + pierw);
            }
            else
            {
                Console.WriteLine("Delta: " + Delta);
                double pierw1 = (-B + Math.Sqrt(Delta)) / (2 * A);
                double pierw2 = (-B - Math.Sqrt(Delta)) / (2 * A);
                Console.WriteLine("Pierwiastek 1: "+ pierw1);
                Console.WriteLine("Pierwiastek 2: "+ pierw2);
            }
            Console.ReadKey();
        }
    }
}
