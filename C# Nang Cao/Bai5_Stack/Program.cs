using System;
using System.Collections;

namespace Bai6_Stack
{
    class Program
    {
        public static void Main(string[] args)
        {
            // Tạo 1 Stack rỗng
            Stack MyStack4 = new Stack();

            // Thực hiện thêm vài phần tử vào Stack thông qua hàm Push.
            MyStack4.Push("Education");
            MyStack4.Push("Free");
            MyStack4.Push("HowKteam");

            // Thử sử dụng các phương thức của Stack.
            Console.WriteLine(" So phan tu hien tai cua Stack la: {0}", MyStack4.Count);

            // Lưu ý ở đây ta chỉ muốn xem giá trị mà không muốn nó khỏi Stack thì ta sẽ dùng Peek.
            Console.WriteLine(" Phan tu dau cua Stack la: {0}", MyStack4.Peek());

            // Thử kiểm tra lại số phần tử để chắc chắn rằng hàm Peek không xoá phần tử ra khỏi Stack.
            Console.WriteLine(" So phan tu cua Stack sau khi goi ham Peek: {0}", MyStack4.Count);

            // Thực hiện xoá các phần tử ra khỏi Stack.
            Console.WriteLine(" Popping...");
            int Length = MyStack4.Count;
            for (int i = 0; i < Length; i++)
            {
                Console.Write(" " + MyStack4.Pop());
            }
            Console.WriteLine();

            // Kiểm tra lại số phần tử của Stack sau khi Pop
            Console.WriteLine(" So phan tu cua Stack sau khi Pop la: {0}", MyStack4.Count);

            Console.ReadKey();
        }
    }
}