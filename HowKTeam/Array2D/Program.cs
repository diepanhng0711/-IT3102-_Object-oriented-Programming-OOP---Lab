using System;

namespace Array2D
{
    class Program
    {
        static void Main(string[] args)
        {
            #region Khai báo mảng 2 chiều

            //CÚ PHÁP: <kiểu dữ liệu>[,] <tên biến> = new <kiểu dữ liệu>[,]
            string[,] Soict = new string[,] {
                                                {"IT1", "IT2" },
                                                {"ITE6", "ITE7" }
                                            };
            
            int[,] matrix32 = new int[3, 2] {
                                                {0, 0},
                                                {1, 1},
                                                {2, 2}
                                            };

            int[,] array23 =
            {
                {1, 2, 3 },
                {1, 2, 3 },
                {1, 2, 3 }
            };

            //Chiều của mảng trong C# được đánh từ số 0
            //Sử dụng array.GetLength() để lấy được chiều dài của mảng theo chiều, ví dụ array.getLength(0) trả về độ dài của chiều thứ nhất trong mảng

            for (int i = 0; i < array23.GetLength(0); i++)
            {
                for (int j = 0; j < array23.GetLength(1); j++)
                {
                    Console.Write("{0, 3}", array23[i, j] );
                }
                Console.WriteLine();
            }

            Console.WriteLine(array23.Rank);        //Trả về số chiều của mảng

            #endregion

            Console.ReadKey();

            #region CT Mẫu

            int Rows, Columns;
            Console.Write(" Moi ban nhap so dong cua mang: ");
            bool checkRows = int.TryParse(Console.ReadLine(), out Rows);
            Console.Write(" Moi ban nhap so cot cua mang: ");
            bool checkColumns = int.TryParse(Console.ReadLine(), out Columns);

            // Tạo 1 mảng 2 chiều với số dòng và số cột đã nhập
            int[,] IntArray = new int[Rows, Columns];
            /* 
             * Duyệt mảng để nhập giá trị cho các phần tử
             * Ở đây mình muốn minh họa cách sử dụng mảng nên mình bỏ qua các bước kiểm tra dữ liệu mà ép kiểu trực tiếp
             * Điều này có thể gây lỗi khi nhập sai nên các bạn hãy cải tiến chương trình này cho đầy đủ nhé!
             */
            for (int i = 0; i < IntArray.GetLength(0); i++)
            {
                for (int j = 0; j < IntArray.GetLength(1); j++)
                {
                    Console.Write(" Moi ban nhap phan tu IntArray[{0}, {1}] = ", i, j);
                    IntArray[i, j] = int.Parse(Console.ReadLine());
                }
            }

            /*
             * In mảng 2 chiều đã nhập ra màn hình
             * Để tính tổng các giá trị trong mảng ta chỉ cần duyệt qua các phần tử và cộng chúng lại với nhau
             * Tận dụng lúc duyệt mảng để in giá trị ta sẽ thực hiện tính tổng luôn để tránh phải duyệt lại mảng thêm lần nữa.
             */
            int Sum = 0;

            Console.WriteLine("\n Mang ban vua nhap la: ");
            for (int i = 0; i < IntArray.GetLength(0); i++)
            {
                for (int j = 0; j < IntArray.GetLength(1); j++)
                {
                    Console.Write(IntArray[i, j] + " ");
                    Sum = Sum + IntArray[i, j];
                }
                // Sau khi in xong mỗi dòng ta thực hiện xuống dòng rồi mới in tiếp
                Console.WriteLine();
            }
            Console.WriteLine(" Tong cac gia tri trong mang: " + Sum);


            #endregion
        }
    }
}