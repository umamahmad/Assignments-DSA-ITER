package semester2.assignment1;
import java.util.Scanner;
public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in KGs: ");
        double weight = sc.nextDouble();
        System.out.println("Enter height in meters: ");
        double height = sc.nextDouble();
        double bmi = (weight)/(height*height);

        if(bmi<18.5)
            System.out.println("Underweight");
        else if (bmi>18.5&&bmi<=24.9)
            System.out.println("Normal Weight");
        else if(bmi>25.0&&bmi<=29.9)
            System.out.println("Over Weight");
        else
            System.out.println("Obese");

    }
}

/*
Enter weight in KGs:
78
Enter height in meters:
1.78
Normal Weight
 */