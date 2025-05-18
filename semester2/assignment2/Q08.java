package semester2.assignment2;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {

    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }

    void Display() {
        System.out.println("Duck Name: " + name);
        System.out.print("Fly Status: ");
        fly();
        System.out.print("Swim Status: ");
        swim();

    }

}

public class Q08 {
    public static void main(String[] args) {
        Duck d1 = new Duck("Donald");
        d1.fly();
        d1.swim();
        System.out.println();
        d1.Display();

    }
}
