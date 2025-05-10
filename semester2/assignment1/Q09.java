package semester2.assignment1;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the matrix: ");
        int n = sc.nextInt();
        double arr [][] = new double[n][n];
        System.out.println("Enter the elements of the matrix: ");

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j]=sc.nextDouble();
            }
        }
        double sum = sumMajorDiagonal(arr);
        System.out.println("Sum the the major diagonal of the matrix: "+sum);
    }
    public static double sumMajorDiagonal(double[][]m)
    {
        double sum = 0;
        for(int i=0; i<m.length; i++)
        {
            sum+=m[i][i];
        }
        return sum;
    }
}

/*
Enter the rows and columns of the matrix:
3
Enter the elements of the matrix:
12.3 52.3 69.1
56.3 25.7 15.9
56.1 25.9 78.4
Sum the the major diagonal of the matrix: 116.4
 */
