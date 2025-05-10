package semester2.assignment1;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int n = sc.nextInt();
        boolean k = isOdd(n);

        System.out.println(n+" is Odd: "+k);
    }

    public static boolean isOdd(int i)
    {
        return (i & 1) == 1;
    }
}
/*
Enter the number to be checked:
123
123 is Odd: true
 */
