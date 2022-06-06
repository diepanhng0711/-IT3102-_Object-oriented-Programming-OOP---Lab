using System;

namespace Object_Intro
{
    class Program
    {
        static void Main(string[] args)
        {
            object obj = "Hust";

            /*
             * Boxing: chuyển từ kiểu dữ liệu giá trị sang kiểu dữ liệu tham chiếu
             */

            int value = 109;

            object objectValue = value;

            int newValue = (int)objectValue;

            //var: từ khóa hỗ trợ khai báo biến không cần kiểu dữ liệu
            //Phải gán giá trị ngay khi khởi tạo biến, k thể khởi tạo giá trị null cho biến var

            var varInt = 25;
            var varBool = true;

            //var không phải là một kiểu dữ liệu

            Console.ReadKey();

            
        }
    }
}