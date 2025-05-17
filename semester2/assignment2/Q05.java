package semester2.assignment2;

abstract class Shape
{
    abstract double getArea();

    void displayArea()
    {
        System.out.println("Area: "+getArea());
    }

}

class Square extends Shape
{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side*side;
    }
}

class Triangle extends Shape
{
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea(){
        return (((double) 1 /2)*base*height);
    }
}

class Circle extends Shape
{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea(){
        return Math.PI*radius*radius;
    }
}


public class Q05
{
    public static void main(String[] args)
    {
        Square sq1 = new Square(15.6);
        System.out.print("Square-> ");
        sq1.getArea(); sq1.displayArea();

        Triangle tri1 = new Triangle(12.6, 36.5);
        System.out.print("Triangle-> ");
        tri1.getArea(); tri1.displayArea();

        Circle c1 = new Circle(69.5);
        System.out.print("Circle-> ");
        c1.getArea(); c1.displayArea();

    }
    
}

/*
Square-> Area: 243.35999999999999
Triangle-> Area: 229.95
Circle-> Area: 15174.677915002098
 */