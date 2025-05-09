package assignment1;
import java.util.Scanner;
public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number greater than 2: ");
        int n = sc.nextInt();
        int p=n;
        int count=0;
        if(n>2) {
            while (p>2) {
                p/=2;
                count++;
            }
        }
        else
            System.out.println("Invalid input");

        System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is: "+count);
    }
}
