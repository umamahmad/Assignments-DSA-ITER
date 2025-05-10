package semester2.assignment1;
import java.util.Scanner;
public class Q10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements row by row: ");

        double[][] arr = new double[3][4];

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.println(sumColumn(arr, 0));
        System.out.println(sumColumn(arr, 1));
        System.out.println(sumColumn(arr, 2));
        System.out.println(sumColumn(arr, 3));
    }

    public static double sumColumn(double [][]m, int columnIndex)
    {
        double sum = 0;
        for(int i=0; i<m.length; i++)
        {
            sum+=m[i][columnIndex];
        }
        return sum;
    }
}

/*
Enter the elements row by row:
78.3 56 96 23.6
45 65 23.6 96.1
113.4 25.3 36 95
236.7
146.3
155.6
214.7
 */
