using System;

namespace Bien
{
    class Program
    {
        static void Main(string[] args)
        {
            //Variables can be modified
            /*
             * Variable:
             * - A data value which can be modified
             * - Using as a reference to a memory area in the memory
             * - Core component of any programming language
             */

            // => Why?
            /*
             * - Storing data and reusing them
             * - Operations with the computer memory in a way much easier
             */

            //Declaration - Syntax
            /*
             * <Data type> <Variable_name>;
             * 
             */

            //Quy tắc lạc đà
            /*
             * - kieuSoNguyen
             * - frequently used for private, protected
             */

            //Pascal rule
            /*
             * - kieuSoNguyen
             */

            /*
             * - Variables should be named briefly, easy to understand, easy to make out the aim of them
             * - Case sensitivity: a <> A || Console.WriteLine <> Console.WRITELINE
             */

            int a = 5;
            float f = 6.9f;
            string s = "HUST = Hanoi University of Science and Technology";
            bool b = true;
            char c = 'D';

            int aNum = 13;
            int bNum = 15;
            int cNum = aNum + bNum;

            //Console.WriteLine(a);       //Output an interger variable

            Console.WriteLine("aNum + bNum = " + cNum);
            Console.WriteLine("aNum + bNum = cNum : {0} + {1} = {2}", aNum, bNum, aNum + bNum);

            Console.ReadKey();
        }
    }
}