package concepts;

public class Main {
    public static void main(String[] args){

        Person amanda = new Person("Amanda", 1993);
        Student diego = new Student("Diego", 1988, 123, "Computer");
        System.out.println(amanda);
        System.out.println(diego);

        System.out.println();

        System.out.println(amanda instanceof Person);
        System.out.println(diego instanceof Person);
        System.out.println(amanda instanceof Student);
        System.out.println(diego instanceof Student);
    }
}
