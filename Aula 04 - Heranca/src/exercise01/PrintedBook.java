package exercise01;

public class PrintedBook extends Book {
    private int numberOfCopies;
    private int weight;

    public PrintedBook(String title, Author author, String genre, int edition, int numberOfCopies, int weight){
        super(title, author, genre, edition);
    }
}
