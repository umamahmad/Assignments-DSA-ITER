package semester2.assignment3;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter your lucky number: ");
            String str = sc.nextLine();
            int luckyNumber = Integer.parseInt(str);

            if (luckyNumber<0)
                throw new NumberFormatException("Negative numbers are not allowed.");

            System.out.println("Your lucky number is: "+luckyNumber);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: "+e.getMessage());
        }


    }
}

/*
Enter your lucky number:
-6
Invalid input: Negative numbers are not allowed.
 */
