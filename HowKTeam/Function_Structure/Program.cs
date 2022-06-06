using System;

namespace Function_Structure
{
    class Program
    {
        static void Main(string[] args)
        {
            Demo();

            Console.ReadKey();
        }

        static void Demo()
        {
            Console.WriteLine("HowKTeam");
            return ;
        }

        /*
         * --> CẤU TRÚC HÀM TRONG C#
         *  [Từ khóa 1][Từ khóa 2][Từ khóa n] <Kiểu trả về> <Tên hàm> (Danh sách tham số) {
         *      //Thân hàm
         *  }
         *  
         *  * Trong đó:
         *  - Từ khóa 1, 2, ...: public, static, private, read only, ...
         *  - Kiểu trả về: int, long, void, SinhVien
         *  - Tên hàm: tên gọi của hàm, có thể đặt tùy ý, nhưng nên đặt them quy tắc đặt tên. Ví dụ: int addTwoNumbers();
         *  - Tham số truyền vào: truyền tham số vào hàm, những tham số này được tạo giá trị bản sao và chỉ sử dụng được trong phạm vi nội bộ của hàm
         *  - Thân chương trình: Đoạn code thực thi của hàm, được viết trong cặp dấu ngoặc nhọn
         *  
         *  LƯU Ý:
         *  - Hàm chỉ được khai báo trong một class
         *  - Không thể khai báo 1 hàm trong 1 hàm khác THEO CÁCH THÔNG THƯỜNG
         */
    }
}
