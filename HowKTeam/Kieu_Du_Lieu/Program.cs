namespace Kieu_Du_Lieu
{
    class Program
    {
        static void Main(string[] args)
        {
            #region VD1

            ////Integer 
            //byte bienByte = 10;
            //short bienShort = 10;   
            //int bienInt = 10;   
            //long bienLong = 10;

            ////Real number
            //float bienFloat = 10.9f;            //f/F suffixes are essential
            //double bienDouble = 10.9;           //No suffix
            //decimal bienDecimal = 10.9m;        //m suffix is essential

            ////Character - String literal
            //char bienChar = 'k';                //''
            //string bienString = "Hust";         //""

            //Console.ReadKey();

            #endregion

            #region VD2

            byte bienByte = 3;
            short bienShort = 9;
            int bienInt = 10;
            long bienLong = 10;

            bienLong = bienByte; // bienLong có kiểu dữ liệu lớn hơn BienByte nên giá trị BienByte có thể gán qua cho BienLong
            Console.WriteLine(" BienLong = " + bienLong);

            bienLong = bienInt; // tương tự như trên
            Console.WriteLine(" BienLong = {0}", bienLong);

            bienShort = bienByte; // tương tự như trên
            Console.WriteLine(" BienShort = " + bienShort);

            bienInt = bienShort; // tương tự như trên
            Console.WriteLine(" BienInt = " + bienInt);

            Console.ReadKey();


            #endregion
        }
    }
}

/*
 * DATA TYPES
 * - Collections of data types with similar attributes, similar storing methods and similar operations on them
 * - A signal which makes the compiler identify the size of a variable and its abilities
 * - A core component of any programming language
 * 
 * => Built-in data types (Primitive data types)      ||      Value data type       ||  Value stored in the stack memory
 * => User-defined data types                         ||      Reference data type   ||  Address referencing to value object in the heap memory stored in the stack memory
 */

// int? a = null;