using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Trojmian
{
   public class Model
    {
        double a, b, c;

        // obsługa pola A
        public double A
        {
            get { return a; }
        }

        public bool InterpretujA(String locA)
        {
            try
            {
                a = Convert.ToDouble(locA);
                return true;
            }
            catch (Exception)
            {
                return false;
            }
        }

        // obsługa pola B
        public double B
        {
            get { return b; }
        }

        public bool InterpretujB(String locB)
        {
            try
            {
                b = Convert.ToDouble(locB);
                return true;
            }
            catch (Exception)
            {
                return false;
            }
        }
        
        // obsługa pola C
        public double C
        {
            get { return c; }
        }

        public bool InterpretujC(String locC)
        {
            try
            {
                c = Convert.ToDouble(locC);
                return true;
            }
            catch (Exception)
            {
                return false;
            }
        }

        double Delta = 0;
        public double obliczDelte()
        {
                Delta = (b * b) - (4 * a * c);
                return Delta;
        }
        public double pierw1()
        {
            double pierw = (-B + Math.Sqrt(Delta)) / (2 * A);
            return pierw;
        }
        public double pierw2()
        {
            double pierw2 = (-B - Math.Sqrt(Delta)) / (2 * A);
            return pierw2;
        }
    }

}
