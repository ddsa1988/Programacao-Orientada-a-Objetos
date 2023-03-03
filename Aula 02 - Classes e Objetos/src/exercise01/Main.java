package exercise01;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        {
            ArrayList<Float> grades = new ArrayList<Float>(Arrays.asList(7f,10f,7.5f));

            Grade myGrades = new Grade(grades);

            System.out.println(myGrades.getGrades());
            System.out.println(myGrades.getAverage());
            System.out.println(myGrades);
        }

        System.out.println();

        {
            ArrayList<Float> grades = new ArrayList<Float>(Arrays.asList(5f,8f,6.8f));

            Student myStudent = new Student("Diego", "Software Engineering ", new Grade(grades));
            System.out.println(myStudent.getGrades());
            System.out.println(myStudent.getAverage());
            System.out.println(myStudent);
        }

    }
}
