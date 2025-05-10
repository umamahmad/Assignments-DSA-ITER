package semester2.assignment1;

import java.util.Scanner;

public class HAQ04 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();

        double a[][] = new double[row][col];
        System.out.println("Enter the elements of the Array a: ");
        for (int i = 0; i< row; i++)
        {
            for (int j = 0; j< col; j++)
            {
                a[i][j] = sc.nextDouble();
            }
        }

        double b[][] = new double[row][col];
        System.out.println("Enter the elements of the Array b: ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                b[i][j] = sc.nextDouble();
            }
        }

        double c[][] = addMatrix(a, b);

        System.out.println("The added matrix: ");
        for (int i=0; i<row; i++)
        {
            for (int j=0; j<col; j++)
            {
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }


    }

    public static double[][] addMatrix(double[][] a, double[][] b)
    {
        int row = a.length;
        int col = a[0].length;
        double[][] result = new double[row][col];

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
}

/*
Enter the number of rows:
3
Enter the number of columns:
3
Enter the elements of the Array a:
1.2 3.2 6.3
5.6 9.6 6.9
3.6 6.3 5.8
Enter the elements of the Array b:
2.3 6.3 1.2
2.3 5.3 6.9
1.2 3.2 7.9
The added matrix:
3.5 9.5 7.5
7.9 14.9 13.8
4.8 9.5 13.7
 */
