package semester2.assignment2;

class Student {
    protected int roll;
    protected String name;
    protected double DSA_mark;

    void getData(int roll, String name, double DSA_mark){
        this.roll = roll;
        this.name = name;
        this.DSA_mark = DSA_mark;
    }

    void showData() {
        System.out.println("The name of the student: "+name);
        System.out.println("The roll of the student: "+roll);
        System.out.println("The DSA mark of the student: "+DSA_mark);
    }
}

public class HAQ11 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getData(12, "Rahul", 56.9);
        Student s2 = new Student();
        s2.getData(56, "Yash", 98.9);
        Student s3 = new Student();
        s3.getData(48, "Ananya", 89.9);
        Student s4 = new Student();
        s4.getData(47, "Aditya", 91.3);
        Student s5 = new Student();
        s5.getData(3, "Aryan", 96.6);

        if (s1.DSA_mark>s2.DSA_mark && s1.DSA_mark>s3.DSA_mark && s1.DSA_mark>s4.DSA_mark && s1.DSA_mark>s5.DSA_mark)
            s1.showData();
        else if (s2.DSA_mark>s1.DSA_mark && s2.DSA_mark>s3.DSA_mark && s2.DSA_mark>s4.DSA_mark && s2.DSA_mark>s5.DSA_mark)
            s2.showData();
        else if (s3.DSA_mark>s1.DSA_mark && s3.DSA_mark>s2.DSA_mark && s3.DSA_mark>s4.DSA_mark && s3.DSA_mark>s5.DSA_mark)
            s3.showData();
        else if (s4.DSA_mark>s1.DSA_mark && s4.DSA_mark>s2.DSA_mark && s4.DSA_mark>s3.DSA_mark && s4.DSA_mark>s5.DSA_mark)
            s4.showData();
        else if (s5.DSA_mark>s2.DSA_mark && s5.DSA_mark>s3.DSA_mark && s5.DSA_mark>s4.DSA_mark && s5.DSA_mark>s1.DSA_mark)
            s5.showData();

    }
}

/*
The name of the student: Yash
The roll of the student: 56
The DSA mark of the student: 98.9
 */