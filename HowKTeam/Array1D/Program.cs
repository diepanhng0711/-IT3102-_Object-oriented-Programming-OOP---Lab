using System;

namespace Array1D
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] Hust = new string[3] { "Hust", "Hanoi University of Science and Technology", "Dai Hoc Bach Khoa Ha Noi" };

            int[] number1;

            int[] number = new int[5] { 1, 6, 13, 7, 4 };

            Console.WriteLine("Ban dau:");
            for (int i = 0; i < number.Length; i++)
            {
                Console.Write(number[i] + " ");
            }

            Console.WriteLine();

            Array.Reverse(number);
            Console.WriteLine("Dao nguoc: ");
            for (int i = 0; i < number.GetLength(0); i++)
            {
                Console.Write(number[i]+ " ");

            }

            Console.WriteLine();

            Array.Sort(number);
            Console.WriteLine("Sap xep: ");
            for (int i = 0; i < number.GetLength(0); i++)
            {
                Console.Write(number[i] + " ");

            }

            Console.ReadKey();
        }
    }
}