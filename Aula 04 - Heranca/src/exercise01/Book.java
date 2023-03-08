package exercise01;

public class Book {
    private String title;
    private Author author;
    private String genre;
    private int edition;

    public Book(String title, Author author, String genre, int edition){
        setTitle(title);
        setAuthor(author);
        setGenre(genre);
        setEdition(edition);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(!title.isBlank() && !title.isEmpty()){
            this.title = title.trim();
        }
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if(!genre.isEmpty() && !genre.isBlank()){
            this.genre = genre;
        }
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        if (edition > 0){
            this.edition = edition;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", genre='" + genre + '\'' +
                ", edition=" + edition +
                '}';
    }
}
