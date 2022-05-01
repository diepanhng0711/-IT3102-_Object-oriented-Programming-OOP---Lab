package hust.soict.hedspi.lab02;

import java.util.Scanner;

public class Add2Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r, c;

        System.out.println("Enter the size of two matrices: ");
        System.out.print("The number of rows = ");
        r = sc.nextInt();
        System.out.print("The number of columns = ");
        c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] s = new int[r][c];

        System.out.println();
        System.out.println("Enter elements of the 1st matrix (A): ");
        System.out.println();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("a[" + (i+1) + "][" + (j+1) + "] = ");
                a[i][j] = sc.nextInt(); 
            }
        }

        System.out.println();
        System.out.println("Matrix A = ");
        System.out.println();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%5d", a[i][j]);
            }
            System.out.println();
            System.out.println();
        }


        System.out.println();
        System.out.println("Enter elements of the 2nd matrix (B): ");
        System.out.println();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("b[" + (i+1) + "][" + (j+1) + "] = ");
                b[i][j] = sc.nextInt(); 
            }
        }

        System.out.println();
        System.out.println("Matrix B = ");
        System.out.println();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%5d", b[i][j]);
            }
            System.out.println();
            System.out.println();
        }
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                s[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println();
        System.out.println("The sum of 2 matrices with the same size A and B =");
        System.out.println();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%5d", s[i][j]);
            }
            System.out.println();
            System.out.println();
        }

        sc.close();
    }
}
