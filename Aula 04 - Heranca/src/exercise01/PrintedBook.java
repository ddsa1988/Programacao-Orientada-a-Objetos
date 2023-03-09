package exercise01;

public class PrintedBook extends Book {
    private int numberOfCopies;
    private int weight;

    public PrintedBook(String title, Author author, String genre, int edition, int numberOfCopies, int weight){
        super(title, author, genre, edition);
        setNumberOfCopies(numberOfCopies);
        setWeight(weight);
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        if(numberOfCopies > 0) {
            this.numberOfCopies = numberOfCopies;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 0) {
            this.weight = weight;
        }
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", PrintedBook{" +
                "numberOfCopies=" + numberOfCopies +
                ", weight=" + weight +
                '}';
    }
}
