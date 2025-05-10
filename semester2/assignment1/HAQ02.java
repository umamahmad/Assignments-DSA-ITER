package semester2.assignment1;

import java.util.Scanner;

public class HAQ02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words in the sentence: ");
        int words = sc.nextInt();
        sc.nextLine();

        String str[] = new String[words];
        System.out.println("Enter the sentence: ");
        for(int i=0; i<words; i++)
        {
            str[i]=sc.nextLine();
        }

        System.out.println("The sentence in reverse order: ");
        for (int i=words-1; i>=0; i--)
        {
            System.out.print(str[i]+" ");
        }

    }
}

/*
Enter the number of words in the sentence:
5
Enter the sentence:
hey
everyone
hows
the
day
The sentence in reverse order:
day  the  hows  everyone  hey
 */
