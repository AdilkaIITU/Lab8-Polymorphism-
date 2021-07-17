public class Book extends Product{
    private String title;
    private String publisher;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getYearPublished() {return yearPublished;}

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    private int yearPublished;
    public Book(int barcode, int regularPrice, String title, String publisher, int yearPublished) {
        super(barcode, regularPrice);
        this.title = title;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }
    @Override
    public double computeSalePrice() {
        return getRegularPrice() * 0.5;
    }
}