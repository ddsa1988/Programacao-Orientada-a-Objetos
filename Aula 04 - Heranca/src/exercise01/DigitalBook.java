package exercise01;

public class DigitalBook extends Book{
    private int download;
    private double size;

    public DigitalBook(String title, Author author, String genre, int edition, int download, double size){
        super(title, author, genre, edition);
        setDownload(download);
        setSize(size);
    }

    public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        if(download > 0) {
            this.download = download;
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if(size > 0){
            this.size = size;
        }
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", DigitalBook{" +
                "download=" + download +
                ", size=" + size +
                '}';
    }
}
