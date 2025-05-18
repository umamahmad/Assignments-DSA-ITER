package semester2.assignment2;

//Shape already exists in the package so Shape1
class Shape1{
    protected String color;

    public Shape1(String color) {
        this.color = color;
    }
}

//Circle already exists in the package so Circle1
class Circle1 extends Shape1 {
    private double radius;

    public Circle1(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double Area(){
        return Math.PI*radius*radius;
    }

    void display() {
        System.out.println("Shape: Circle");
        System.out.println("Color: "+color);
        System.out.println("Radius of the Circle: "+radius);
        System.out.println("The Area of Circle is: "+Area());
        System.out.println();
    }
}

class Rectangle extends Shape1 {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    double Area() {
        return length*width;
    }

    void display() {
        System.out.println("Shape: Rectangle");
        System.out.println("Color: "+color);
        System.out.println("Length of the rectangle: "+length);
        System.out.println("Breadth of the rectangle: "+width);
        System.out.println("The Area of rectangle is: "+Area());
        System.out.println();

    }
}

public class Q07 {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1("Red", 36.2);
        c1.display();

        Rectangle r1 = new Rectangle("Blue", 23.6,19.48);
        r1.display();

    }
}

/*
Shape: Circle
Color: Red
Radius of the Circle: 36.2
The Area of Circle is: 4116.868676970209

Shape: Rectangle
Color: Blue
Length of the rectangle: 23.6
Breadth of the rectangle: 19.48
The Area of rectangle is: 459.72800000000007
 */
