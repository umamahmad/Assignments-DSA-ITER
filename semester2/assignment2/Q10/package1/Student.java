package semester2.assignment2.Q10.package1;

public class Student {
    protected String name;
    protected int roll;

    public void inputDetails(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void showDetails() {
        System.out.println("Name of the students: "+name);
        System.out.println("Student's roll: "+roll);
    }
}
