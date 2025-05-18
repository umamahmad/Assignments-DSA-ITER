package semester2.assignment2;

class Employee {
    protected String name;
    protected double salary;


    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    void diplayDetailsInfo() {
        System.out.println("Name of the employee: "+name);
        System.out.println("Salary of the employee: "+salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(double salary, String name, String department) {
        super(salary, name);
        this.department = department;
    }

    void displayManagerDetails(){
        super.diplayDetailsInfo();
        System.out.println("Department: "+department);
    }
}

public class Q09 {
    public static void main(String[] args) {
        Manager m1 = new Manager(36597.36,"Alex","Cyber Security");
        m1.displayManagerDetails();
    }
}

/*
Name of the employee: Alex
Salary of the employee: 36597.36
Department: Cyber Security
 */