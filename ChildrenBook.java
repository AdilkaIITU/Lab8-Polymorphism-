public class ChildrenBook extends Book{
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private int age;
    public ChildrenBook(int barcode, int regularPrice, String title, String publisher, int yearPublished, int age) {
        super(barcode, regularPrice, title, publisher, yearPublished);
        this.age = age;
    }
    @Override
    public double computeSalePrice() {
        return getRegularPrice() * 0.25;
    }
}