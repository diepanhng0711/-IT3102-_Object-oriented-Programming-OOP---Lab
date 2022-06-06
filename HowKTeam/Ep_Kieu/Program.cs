using System;

namespace Ep_Kieu
{
    class Program
    {

        static void Main(string[] args)
        {
            #region Chuyển đổi ngầm định
            //Được thực hiện tự động bởi trình biên dịch, từ kiểu dữ liệu nhỏ hơn sang kiểu dữ liệu lớn hơn

            //int k = 10;
            //long l = k; //long > int => chuyển giá trị k từ int => long rồi gán vào biến long là l

            //float f = 10.96f;
            //double d = f; //Như trên
            #endregion

            #region Chuyển đổi kiểu tường minh 
            //Chuyển kiểu 1 cách rõ ràng sử dụng từ khóa chỉ định
            //Thường được dùng để chuyển đổi các kiểu dữ liệu có tính chất tương tự nhau
            //Hỗ trợ việc boxing, unboxing đối tượng
            //Cú pháp ngắn gọn do không sử dụng phương thức
            //Có thể xảy ra mất mát dữ liệu nếu chuyển từ kiểu dữ liệu lớn hơn về kiểu dữ liệu bé hơn

            //int i = 300;
            //byte b = (byte)i;   //byte có giới hạn 255 => mất mát dữ liệu (buffer overflow)
            //Console.WriteLine(i);
            //Console.WriteLine(b);

            //int a = 5;
            //int c = 2;
            ////float tt == a*1.0f/ c;
            //float f = (float)a /c;

            //Console.WriteLine(f);

            //Console.ReadKey();

            #endregion

            #region Parse()
            //Sử dụng phương thức, lớp hỗ trợ sẵn

            //string s = "10";
            //int k = int.Parse(s);       //Chuyển đổi 1 chuỗi sang 1 kiểu dữ liệu cơ bản tương ứng
            //double e = double.Parse("10.69");
            #endregion

            #region TryParse()0

            int Result;
            bool isSuccesss;
            string Data1 = "10";
            string Data2 = "KTeam";

            isSuccesss = int.TryParse(Data1, out Result);
            Console.WriteLine(isSuccesss == true? "Success!" : "Fail!");
            Console.WriteLine("Result = " + Result);

            isSuccesss = int.TryParse(Data2, out Result);
            Console.WriteLine(isSuccesss == true ? "Success!" : "Fail!");
            Console.WriteLine("Result = " + Result);

            Console.ReadKey();  

            #endregion

            //Lớp Convert
            int value = Convert.ToInt32("9");
        }
    }
}

/*
 *Chuyển đổi ngầm định
 *Chuyển đổi tường minh
 *Sử dụng phương thức, lớp hỗ trợ sẵn => Parse(); TryParse(); Convert
 *Người dùng tự định nghĩa kiểu chuyển đổi
 */
