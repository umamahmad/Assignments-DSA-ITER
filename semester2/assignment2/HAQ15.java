package semester2.assignment2;

class PointType {
    protected double x;
    protected double y;

    void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void showPoint() {
        System.out.println("Point: ("+x+", "+y+")");
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }
}

class CircleType extends PointType {
    protected double radius;

    void setRadius(double radius) {
        this.radius = radius;
    }

    void printRadius() {
        System.out.println("Radius: "+radius);
    }

    double calculateArea() {
        return Math.PI*radius*radius;
    }

    double calculateCircumference() {
        return 2*Math.PI*radius;
    }

    void printAreaAndCircumference()  {
        System.out.println("Area of the Circle: "+calculateArea());
        System.out.println("Circumference of the Circle: "+calculateCircumference());
    }

    void showCenter() {
        showPoint();
    }
}

public class HAQ15 {
    public static void main(String[] args) {
        CircleType c1 = new CircleType();
        c1.setCoordinates(12.58, 19.45);
        c1.setRadius(9.56);

        System.out.print("Center of the circle: ");
        c1.showCenter();

        c1.printRadius();
        c1.printAreaAndCircumference();

    }
}

/*
Center of the circle: Point: (12.58, 19.45)
Radius: 9.56
Area of the Circle: 287.12146234512414
Circumference of the Circle: 60.067251536636846
 */
