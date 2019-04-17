public class Publication {
    private String title;
    private String author;
    private int numberOfPages;
    private double price;

    public Publication(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.numberOfPages = (int)(numberOfPages/0.1);
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
        float price = (float) (numberOfPages*0.10);
        this.setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        int numberOfPages = (int) (price * 0.10);
        this.setNumberOfPages(numberOfPages);
    }

    @Override
    public String toString () {
        return "title: " + title + " author" + author + " n.Pages: " + numberOfPages + " Price: " + price;
    }
}