using System;

namespace IO_Sample_Program
{
    class Program
    {
        static void Main(String[] args)
        {
            //Quy tắc thực hiện: lệnh bên trong trước, rồi mới đến lệnh bên ngoài chứa nó
            Console.WriteLine("Hanoi University of Science and Technology");
            Console.Write("Please enter your name: ");
            Console.WriteLine("Ten cua ban la: " + Console.ReadLine());         //Console.ReadLine() ---> Cộng chuỗi ---> in ra màn hình
            Console.Write("Moi ban nhap ngay sinh cua minh: ");
            Console.WriteLine("Ngay sinh cua ban la: " + Console.ReadLine());
            Console.Write("Moi ban nhap que quan: ");
            Console.WriteLine("Que quan: " + Console.ReadLine());

            Console.ReadKey();
        }
    }

}


