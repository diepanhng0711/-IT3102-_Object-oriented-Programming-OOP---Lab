using System;

namespace Nhap_Xuat_Co_Ban
{
    class Program
    {
        static void Main(String[] args)
        {
            #region Console.Write()

            //Console.Write("Nguyen Viet Duc");
            //Console.Write(10);
            //Console.Write(10.9f);
            //Console.Write(true);

            #endregion

            #region Console.WriteLine()

            //Console.WriteLine("Nguyen Viet Duc");               //Line break using Console.WriteLine()
            //Console.Write("Dai hoc Bach Khoa Ha Noi \n");       //Line break using special character '\n'
            //Console.WriteLine(10);
            //Console.WriteLine(10.9f);
            //Console.Write(true);
            //Console.Write(Environment.NewLine);                 //Line break using line break statement
            //Console.Write("Khong");

            //Console.ReadLine();                                 //Waiting for user pressing Enter button
            #endregion

            //int a = 5;
            //Console.Write("a = ");
            //Console.Write(a);

            //Console.ReadLine();

            //Console.WriteLine("a = {0} " + "{1}", 5, 8);

            #region Console.Read()

            //Console.WriteLine(Console.Read());                  //Read data input from the keyboard until line break, then return ASCII value of the the first character entered 
            //Console.ReadKey();

            //Console.WriteLine(Console.ReadLine());              //Read data input from the keyboard until line break, then display the data entered from the keyboard on the screen
            //Console.ReadKey();

            #endregion

            #region Console.ReadKey()

            Console.WriteLine("C Sharp");

            //Đọc 1 ký tự từ bàn phím, trả về kiểu ConsoleKeyInfo
            //Read a character from the keyboard, then return a ConsoleKeyInfo value
            Console.ReadKey();
            Console.ReadKey(false);                                 //Hiển thị phím ấn lên màn hình
            Console.ReadKey(true);                                  //Không hiển thị phím ấn lên màn hình

            #endregion

        }
    }
}