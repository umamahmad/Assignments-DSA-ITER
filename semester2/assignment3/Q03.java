package semester2.assignment3;

class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String msg) {
        super(msg);
    }
}

class Student {
    protected String name;
    protected double mark;

    public Student(String name, double mark) throws MarksOutOfBoundsException{

        if(mark>100) {
            throw new MarksOutOfBoundsException("Marks cannot be greater than 100!");
        }

        this.name = name;
        this.mark = mark;
    }

    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Marks: "+mark);
    }

}

public class Q03 {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Alex", 78);
            s1.display();
            Student s2 = new Student("Carl", 107);
            s2.display();
        }catch (MarksOutOfBoundsException e) {
            System.out.println("Exception: "+e.getMessage());
        }

    }
}

/*
Name: Alex
Marks: 78.0
Exception: Marks cannot be greater than 100!
 */