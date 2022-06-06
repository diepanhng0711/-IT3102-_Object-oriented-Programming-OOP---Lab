using System;

namespace Hang_Constant
{
    class Program
    {
        static void main(string[] args)
        {
            const int x = 10;

            const int a = 5;
            const int b = a;


        }
    }
}

/*
 * Hằng là một biến không thay đổi giá trị trong suốt chương trình
 * Bắt buộc phải khởi tạo giá trị khi khai báo
 * 
 * Để ngăn chặn việc gán giá trị khác vào
 * Hằng làm cho chương trình dễ đọc hơn: số vô tri => hằng có tên ý nghĩa hơn
 * Hằng giúp cho chương trình dễ nâng cấp, sửa chữa hơn
 * Hằng giúp việc tránh lỗi dễ dàng hơn
 */