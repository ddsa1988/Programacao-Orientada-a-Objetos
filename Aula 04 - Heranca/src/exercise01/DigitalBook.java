package exercise01;

public class DigitalBook extends Book{
    private int download;
    private double size;

    public DigitalBook(String title, Author author, String genre, int edition, int download, double size){
        super(title, author, genre, edition);
    }
}
