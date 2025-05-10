package semester2.assignment1;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();
        int sum = 0;

        int arr[][] = new int[r][c];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of the 2D array are: ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of the elements of the array: " + sum);
    }
}

/*
Enter the number of rows:
3
Enter the number of columns:
3
Enter the elements of the array:
7 5 1
8 9 3
4 5 8
The elements of the 2D array are:
7 5 1
8 9 3
4 5 8
Sum of the elements of the array: 50
 */