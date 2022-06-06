using System;

namespace Dynamic_Keyword
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
             * dynamic: từ khóa dùng để khai báo kiểu dynamic
             * - Khái niệm mới được đưa vào từ C# 4.0
             * - Được khai báo với cú pháp tương tự như khai báo biến thông thường
             * - ĐẶC ĐIỂM: các đối tượng thuộc kiểu dynamic sẽ không được xác định kiểu cho đến khi CHƯƠNG TRÌNH ĐƯỢC THỰC THI
             *      (nghĩa là trình biên dịch sẽ bỏ qua mọi lỗi về cú pháp, việc kiểm tra sẽ được thực hiện khi chương trình thực thi)
             * - Hỗ trợ Dynamic Programming cho ngôn ngữ lập trình tĩnh như C#, cải thiện khả năng tương thích với các ngôn ngữ và nền tảng động, giúp việc viết code đơn giản và nhanh hơn, có thể ép kiểu qua lại với các kiểu dữ liệu khác một cách bình thường
             */

            //dynamic StringValue = "Hust";

            //StringValue++;          //Không hề báo lỗi do chương trình biên dịch chưa xác định kiểu của StringValue, đến khi thực thi chương trình, StringValue mới được phát hiện là kiểu String và không thực hiện được toán tử ++

            #region Chương trình sử dụng dynamic

            //Khai báo 2 biến Name, Mission kiểu string và khởi tạo giá trị
            string Name = "Hust";
            string Mission = "Nang Bach Khoa thieu dot doi trai tre";

            /*
             * - Thực hiện gán 1 biến kiểu string cho biến kiểu dynamic bằng cách ép kiểu ngầm định (implicit)
             * - Sau phép gán này thì DynamicValue chứa giá trị là "Hust", tuy nhiên kiểu dữ liệu của nó vẫn chưa được xác định
             */
            dynamic DynamicName = Name;

            //Thực hiện cộng chuỗi và in ra màn hình
            Console.WriteLine("Mission of " + DynamicName + " is " + Mission);

            #endregion 

            //- Object : kiểu dữ liệu cơ bản của tất cả các kiểu dữ liệu trong C#
            //- var    : từ khóa để khai báo ngầm định kiểu dữ liệu anonymous
            //- dynamic: từ khóa để báo kiểu dynamic, có thể tương tác với mọi kiểu dữ liệu nhưng chỉ có thể được xác định kiểu dữ liệu khi chương trình thực thi ( khác với object )

            Console.ReadLine(); 
        }
    }
}
