package hust.soict.hedspi.lab02;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int a[] = {1789, 2035, 1899, 1456, 2013};
        int sum = 0; 
        int count = 0;
        double avg = 0;
        
        System.out.println("The order of array elements before sorting: ");
        System.out.println(Arrays.toString(a));

        //Sorting arrays using method from java.util.Arrays
        Arrays.sort(a);

        System.out.println("The order of array elements after sorting: ");
        System.out.println(Arrays.toString(a));

        for (int i : a) {
            sum += i;
            count++;
        }
        avg = (double) sum/count;

        System.out.print("The sum value of array elements = ");
        System.out.println(sum);
        System.out.print("The average value of array elements = ");
        System.out.println(avg);
    }
}
