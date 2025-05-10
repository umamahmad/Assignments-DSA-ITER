package semester2.assignment1;
import java.util.Scanner;
public class Q07 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = arr[0], min = arr[0], cmax = 0, cmin = 0;
        int firstMaxIndex = -1, lastMinIndex = -1;

        for (int i=1; i<arr.length; i++)
        {
            if(arr[i]>max)
                max=arr[i];

            if(arr[i]<min)
                min = arr[i];
        }

        for (int i = 0; i<arr.length; i++)
        {
            if(arr[i]==max) {
                cmax += 1;
                if (firstMaxIndex == -1)
                    firstMaxIndex = i;
            }
            if(arr[i]==min) {
                cmin += 1;
                lastMinIndex = i;
            }
        }
        System.out.println("Max element of the array: "+max+" and numbers of times it occured is: "+ cmax);
        System.out.println("Min element of the array: "+min+" and numbers of times it occured is: "+ cmin);
        System.out.println("First occurrence of maximum element is at position: " + (firstMaxIndex + 1));
        System.out.println("Last occurrence of minimum element is at position: " + (lastMinIndex + 1));
    }
}

/*
Enter the number of elements:
10
Enter the elements of the array:
2 3 6 5 1 1 4 1 9 9
Max element of the array: 9 and numbers of times it occured is: 2
Min element of the array: 1 and numbers of times it occured is: 3
First occurrence of maximum element is at position: 9
Last occurrence of minimum element is at position: 8
 */