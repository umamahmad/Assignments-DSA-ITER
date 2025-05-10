package semester2.assignment1;

import java.util.Scanner;

public class HAQ03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];

        System.out.println("Enter the elements of array a: ");
        for (int i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of array b: ");
        for (int i=0; i<b.length; i++)
        {
            b[i] = sc.nextInt();
        }

        System.out.println("Dot product of both the arrays: ");
        for (int i=0; i<c.length; i++)
        {
            c[i] = a[i]*b[i];
            System.out.print(c[i]+" ");
        }
    }
}

/*
Enter the size of the array:
3
Enter the elements of array a:
12 32 65
Enter the elements of array b:
45 98 65
Dot product of both the arrays:
540 3136 4225
 */
