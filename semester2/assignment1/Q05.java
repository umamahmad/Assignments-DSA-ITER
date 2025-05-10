package semester2.assignment1;
import java.util.Scanner;
public class Q05 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum =0;

        while(num>9)
        {
            sum = sum_of_digits(num);
            num = sum;
        }
        System.out.println(sum);

    }

    public static int sum_of_digits(int n)
    {
        int sum=0;
        while (n>0)
        {
            int rem = n%10;
            n/=10;
            sum+=rem;
        }
        return sum;
    }
}
/*
Enter the number:
1236
3
 */