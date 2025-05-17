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

    }
}

public class Q06 {
    public static void main(String[] args) {


    }

}