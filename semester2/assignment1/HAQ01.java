package semester2.assignment1;

import java.util.Scanner;

public class HAQ01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();

        if (a+b==c)
            System.out.println("a + b = c is a valid expression.");
        else if (a==b-c)
            System.out.println("a = b - c is a valid expression.");
        else if (a*b==c)
            System.out.println("a * b = c is a valid expression.");

    }
}

/*

Enter a:
2
Enter b:
3
Enter c:
5
a + b = c is a valid expression.

 */
