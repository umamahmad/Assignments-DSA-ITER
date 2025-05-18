package semester2.assignment2.Q10.package3;

import semester2.assignment2.Q10.package1.Test;
import semester2.assignment2.Q10.package2.Sports;

public class Result extends Test implements Sports {

    public void displayDetails() {
        int totalMarks = mark1 + mark2;
        int totalScore = score1 + score2;

        showDetails();
        System.out.println("Total marks: "+totalMarks);
        System.out.println("Total score: "+totalScore);
        System.out.println("Grand total: "+(totalMarks+totalScore));
    }


    public static void main(String[] args) {
        Result r1 = new Result();
        r1.inputDetails("Rahul", 43, 89,94);
        r1.displayDetails();

    }
}

/*
Name of the students: Rahul
Student's roll: 43
Mark1: 89
Mark2: 94
Total marks: 183
Total score: 25
Grand total: 208
 */