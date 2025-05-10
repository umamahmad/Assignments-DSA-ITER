package semester2.assignment2;
import java.util.Scanner;
class Car{

    public int year;
    public String model;

    Car()
    {
        year = 2020;
        model = "Toyota";
    }
    
    void setDetails(int year, String model)
    {
        this.year=year;
        this.model=model;
    }

    void displayDetails()
    {
        System.out.println("Car model: "+model);
        System.out.println("Released year: "+year);
    }
}


public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year of release: ");
        int year = sc.nextInt();
        System.out.println("Enter the the model: ");
        String model = sc.next();

        Car c1 = new Car();
        Car c2 = new Car();
        c2.setDetails(year, model);

        c1.displayDetails();
        c2.displayDetails();

        if(c1.year<c2.year)
        {
            System.out.println(c2.model+" is newer.");
        }
        else if(c1.year>c2.year)
        {
            System.out.println(c1.model+" is newer.");
        }
        else
            System.out.println("Both are of same age.");
    }

}
