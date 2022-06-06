using System;
using System.Collections;

namespace Bai2_ArrayList
{

    class Person
    {
        private string name;
        private int age;

        public string Name { 
            get { return name; } 
            set { name = value; } 
        }
        public int Age { 
            get { return age;} 
            set { age = value; } 
        }

        public Person(string name, int age)
        {
            this.name = name;
            this.age = age; 
        }

        public override string ToString()
        {
            return ("Name: " + name + "\nAge: " + age);
        }
    }

    public class SortPerson : IComparer
    {
        public int Compare(object x, object y)  
        {
            Person p1 = (Person) x;
            Person p2 = (Person) y;

            if (p1 == null || p2 == null)
            {
                throw new InvalidOperationException();
            } else
            {
                if (p1.Age > p2.Age) return 1;
                else if (p1.Age < p2.Age) return -1;
                else return 0;
            }
        }
}
    class Program
    {
        public static void Main(string[] args)
        {
            //ArrayList MyArray = new ArrayList();        //Khởi tạo ArrayList rỗng
            //ArrayList MyArray2 = new ArrayList(5);      //Khởi tạo Array với capacity là 5

            //ArrayList MyArray3 = new ArrayList(MyArray2);       //Sao chép toàn bộ phần tử MyArray2 vào MyArray3


            //Console.ReadLine();

            ArrayList arrPerson = new ArrayList();

            arrPerson.Add(new Person("Nguyen Viet Duc", 21));
            arrPerson.Add(new Person("Ha Diep Anh", 22));
            arrPerson.Add(new Person("Duong Ngoc Hai", 21));

            Console.WriteLine("Danh sach ban dau: ");

            foreach(Person p in arrPerson)
            {
                Console.WriteLine(p.ToString());
            }

            arrPerson.Sort(new SortPerson());

            //Array.Sort(arrPerson, new SortPerson());

            Console.WriteLine();

            foreach (Person p in arrPerson)
            {
                Console.WriteLine(p.ToString());
            }

            Console.ReadLine();
        }
    }
}
