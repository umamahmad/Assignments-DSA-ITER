package assignment1;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n;
        int p = n;
        int sum = 0;

        int prod;
        int rem;
        for(prod = 1; s > 0; sum += rem) {
            rem = s % 10;
            s /= 10;
        }

        while(p > 0) {
            rem = p % 10;
            p /= 10;
            prod *= rem;
        }

        if (sum == prod) {
            System.out.println(n + " is a spy number.");
        } else {
            System.out.println(n + " is not a spy number.");
        }

    }
}
