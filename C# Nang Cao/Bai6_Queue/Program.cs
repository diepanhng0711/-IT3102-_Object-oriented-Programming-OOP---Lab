using System;
using System.Collections;

namespace Bai6_Queue
{
    class Program
    {
        public static void Main(string[] args)
        {
            // Tạo 1 Queue rỗng
            Queue MyQueue4 = new Queue();

            // Thực hiện thêm vài phần tử vào Queue thông qua hàm Enqueue.
            MyQueue4.Enqueue("HowKteam");
            MyQueue4.Enqueue("Free");
            MyQueue4.Enqueue("Education");

            // Thử sử dụng các phương thức của Queue.
            Console.WriteLine(" So phan tu hien tai cua Queue la: {0}", MyQueue4.Count);

            // Lưu ý ở đây ta chỉ muốn xem giá trị mà không muốn nó khỏi Queue thì ta sẽ dùng Peek.
            Console.WriteLine(" Phan tu dau cua Queue la: {0}", MyQueue4.Peek());

            // Thử kiểm tra lại số phần tử để chắc chắn rằng hàm Peek không xoá phần tử ra khỏi Queue.
            Console.WriteLine(" So phan tu cua Queue sau khi goi ham Peek: {0}", MyQueue4.Count);

            // Thực hiện xoá các phần tử ra khỏi Queue thông qua hàm Dequeue.
            Console.WriteLine(" Popping...");
            int Length = MyQueue4.Count;
            for (int i = 0; i < Length; i++)
            {
                //Console.WriteLine(MyQueue4.Peek());
                Console.Write(" " + MyQueue4.Dequeue());
            }
            Console.WriteLine();

            // Kiểm tra lại số phần tử của Queue sau khi Pop
            Console.WriteLine(" So phan tu cua Queue sau khi Pop la: {0}", MyQueue4.Count);

            Console.ReadLine();
        }
    }
}
