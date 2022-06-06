using System;

namespace Goto
{
    class Program
    {
        static void Main(string[] args)
        {
            //Cấu trúc Goto có thể tạo ra 1 vòng lặp, nhưng không phải là 1 cấu trúc lặp (vòng lặp không chính quy)
            //Goto: đi đến đâu đó
            //    goto HowKTeam;

            //    Console.WriteLine("Not goto");
            //HowKTeam:

            //    Console.WriteLine("goto");

            //    Console.ReadKey();

            #region VD1

            //int a = 2;
            //switch (a)
            //{
            //    case 1:             // label case 1
            //        Console.WriteLine("Case 1");
            //        break;
            //    case 2:             // label case 2
            //        Console.WriteLine("Case 2");
            //        goto case 1;    // dịch chuyển tới label case 1
            //        break;          // Đoạn code này thừa vì sẽ không bao giờ thực thi
            //    case 3:             // label case 3
            //        Console.WriteLine("Case 3");
            //        break;
            //}

            #endregion

            #region VD2

            //    int a = 1;
            //    // nếu a == 2
            //    if (a == 2)
            //    {
            //        // dịch chuyển tới vị trí label a_Is_2
            //        goto a_Is_2;
            //    }

            //    Console.WriteLine("A == 1");
            //a_Is_2:
            //    Console.WriteLine("A == 2");

            //    Console.ReadKey();

            #endregion

            #region VD3

            int a = 2;

        Ifinity_Loop:
            // nếu a == 2
            if (a == 2)
            {
                // dịch chuyển tới vị trí label a_Is_2
                goto a_Is_2;
            }

            Console.WriteLine("A == 1");
        a_Is_2:
            Console.WriteLine("A == 2");
            goto Ifinity_Loop; // dịch chuyển tới vị trí label Ifinity_Loop

            Console.ReadKey();

            #endregion 
        }
    }
}