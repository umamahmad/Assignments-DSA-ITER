package semester2.assignment2;

class Distance {
    protected int feet;
    protected int inch;

    public Distance(int feet, int inch) {
        this.feet = feet;
        this.inch = inch;
    }

    void displayDistance() {
        System.out.print(feet+"' "+inch+"\" ");
    }
}

class Measurement extends Distance {
    protected double centimeters;

    public Measurement(int feet, int inch, double centimeters) {
        super(feet, inch);
        this.centimeters = centimeters;
    }

    void displayMeasurement() {
        System.out.print("The distance: ");
        super.displayDistance();
        System.out.println(centimeters + "cm");

    }
}
public class HAQ14 {
    public static void main(String[] args) {
        Measurement m1 = new Measurement(23, 14, 29.3);
        m1.displayMeasurement();

    }
}

/*
The distance: 23' 14" 29.3 cm
 */