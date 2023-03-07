package exercise02;

public class Main {
    public static void main(String[] args){
        Student myStudent = new Student("Diego", 131, 185, "Computer", 1000);
        System.out.println(myStudent.info());
        System.out.println(myStudent.payment());
    }
}
