using System;
using System.Collections;

namespace Bai3_HashTable
{
    
    class Program
    {
        public static void Main(string[] args)
        {
            #region Khởi tạo HashTable

            Hashtable hash = new Hashtable(); //new Hashtable(2): có capacity

            hash.Add("K", "KTeam");
            hash.Add("H", "HowKTeam");
            hash.Add("FE", "Free Education");

            Console.WriteLine(hash.Count);

            //Mỗi phần tử trong Hashtable bao gồm cặp key- value được C# định nghĩa là 1 đối tượng có kiểu DictionaryEntry
            foreach(DictionaryEntry entry in hash)
            {
                Console.WriteLine(entry.Key + "\t" + entry.Value);
            }

            //Việc truy xuất các phần tử trong HashTable tương tự như Array, nhưng thông qua Key thay vì Index

            Console.WriteLine();
            Console.WriteLine(hash["FE"]);

            // In ra màn hình giá trị Value trong 1 Key không tồn tại.
            Console.WriteLine(hash["VT"]);

            // Để chắc chắn là null ta thử kiểm tra bằng điều kiện if.
            if (hash["VT"] == null)
            {
                Console.WriteLine("Key 'VT' is not exists");
            }

            // thực hiện gán giá trị cho 1 Key không tồn tại.
            hash["Kt"] = "Kter";
            hash["Hust"] = "7.5 nam ra truong"; 

            // thực hiện in lại số phần tử của Hashtable để thấy sự thay đổi.
            Console.WriteLine("\nCount: " + hash.Count);
            foreach (DictionaryEntry item in hash)
            {
                Console.WriteLine(item.Key + "\t" + item.Value);
            }

            Console.ReadLine();

            #endregion
        }
    }
}
