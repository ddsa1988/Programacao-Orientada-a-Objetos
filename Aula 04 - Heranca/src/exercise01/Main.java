package exercise01;

public class Main {
    public static void main(String[] args){
        Book myBook = new Book("Test1", new Author("Diego", "d@1988", "Brazil"), "Terror", 123);
        System.out.println(myBook);
        System.out.println();

        DigitalBook myDigitalBook = new DigitalBook("Test2", new Author("Amanda", "a@123", "EUA"), "Science",
                1, 10,20);
        System.out.println(myDigitalBook);
        System.out.println();

        PrintedBook myPrintedBook = new PrintedBook("Test3", new Author("Taina", "t@3434", "Mexico"), "Education",
                5, 2000, 2);

        System.out.println(myPrintedBook);
    }
}
