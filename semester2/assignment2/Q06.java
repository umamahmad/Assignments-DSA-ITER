package semester2.assignment2;

class Vehicle {
    String model;
    int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

//Car1 is written because in the same package I have the Car class in Q01
class Car1 extends Vehicle {
    int CarID;
    double price;

    public Car1(String model, int year, int CarID, double price) {
        super(model, year);
        this.CarID = CarID;
        this.price = price;
    }

    void display() {
        System.out.println("Car model: "+ model);
        System.out.println("Launched year: "+ year);
        System.out.println("Car ID: "+ CarID);
        System.out.println("Car Price: "+ price);
    }
}

public class Q06 {
    public static void main(String[] args) {
         Car1 mycar = new Car1("BMW", 2021, 32568, 5450500.32);
         mycar.display();
    }

}

/*
Car model: BMW
Launched year: 2021
Car ID: 32568
Car Price: 5450500.32
 */