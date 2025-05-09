package assignment1;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean k = isOdd(n);

        System.out.println(n+" is Odd: "+k);
    }

    public static boolean isOdd(int i)
    {
        return (i & 1) == 1;
    }
}
