using System;

namespace Ref_Out_Keyword
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
             * TỪ KHÓA <REF>
             * - không copy giá trị ra vùng nhớ khác để sử dụng khi truyền tham số vào hàm, mà sử dụng trực tiếp giá trị được truyền vào trên vùng nhớ đó để sử dụng trong hàm
             * - Thêm từ khóa ref trước kiểu dữ liệu của tham số truyền vào ở khai báo hàm và hàm được sử dụng
             * - Đỡ tốn bộ nhớ, chạy nhanh hơn. Tuy vậy, cần quản lý những tham số này 1 cách cẩn thận
             * - Không thể truyền vào giá trị hằng
             * - Có thể có 1 hoặc nhiều tham số có chứa từ khóa ref ở lời khai báo hàm
             * - Biến truyền vào PHẢI ĐƯỢC KHỞI TẠO GIÁ TRỊ trước khi truyền vào hàm với từ khóa ref
             * - Hàm sử dụng sẽ thao tác trực tiếp với giá trị của vùng nhớ trên RAM --> thay đổi được giá trị tại vùng nhớ đó khi truyền tham số vào hàm
             */

            int value = 5;

            Console.WriteLine("Before = " + value);

            IncreaseValue(ref value);

            Console.WriteLine("After = " + value);

            DecreaseValue(out value);

            Console.WriteLine("After = " + value);

            IncreaseValue(ref value);

            Console.WriteLine("After = " + value);

            /*
             * TỪ KHÓA <OUT>
             * - Phải có từ khóa out trước tên parameter của hàm và trước tên biến truyền vào khi gọi hàm sử dụng
             * - Vùng nhớ của các parameter sẽ được hàm sử dụng thao tác trực tiếp, dẫn đến khi kết thúc lời gọi hàm giá trị của các parametter có thể bị thay đổi
             * - TUY VẬY, biến truyền vào có từ khóa out SẼ KHÔNG CẦN KHỞI TẠO GIÁ TRỊ BAN ĐẦU
             * - Tham số đó chỉ như 1 thùng chứa kết quả trả về khi gọi hàm
             * - Đồng thời, tham số đó phải được khởi tạo ngay bên trong lời gọi hàm
             */
        }

        static void IncreaseValue(ref int value) { 
            value++; 
        }

        static void DecreaseValue(out int value)
        {
            value = 0;
            value--;
        }
    }
}
