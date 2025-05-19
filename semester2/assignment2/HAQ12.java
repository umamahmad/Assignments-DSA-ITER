package semester2.assignment2;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

//Employee already exists in the same package
class Employee1 extends Person {
    private int E_id;
    private double salary;

    public Employee1(String name, int age, int E_id, double salary) {
        super(name, age);
        this.E_id = E_id;
        this.salary = salary;
    }

    void empDisplay() {
        System.out.println("Name of the employee: "+name);
        System.out.println("Age of the employee: "+age);
        System.out.println("Employee ID: "+E_id);
        System.out.println("Salary of the employee: "+salary);
    }
}

public class HAQ12 {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Alex Hernandez", 28, 65982, 668124.7);
        e1.empDisplay();
    }
}

/*
Name of the employee: Alex Hernandez
Age of the employee: 28
Employee ID: 65982
Salary of the employee: 668124.7
 */