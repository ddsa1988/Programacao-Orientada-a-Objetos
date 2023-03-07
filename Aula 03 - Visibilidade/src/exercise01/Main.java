package exercise01;

public class Main {
    public static void main(String[] args){
        Grade myGrades = new Grade(6f,4f);

        System.out.println(myGrades.getGrade1());
        System.out.println(myGrades.getGrade2());
        myGrades.result();
    }
}
