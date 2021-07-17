public abstract class Product {
    private int barcode;
    public int getBarcode() {
        return barcode;
    }
    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }
    public int getRegularPrice() {
        return regularPrice;
    }
    public void setRegularPrice(int regularPrice) {
        this.regularPrice = regularPrice;
    }
    private int regularPrice;
    protected Product(int barcode, int regularPrice) {
        this.barcode = barcode;
        this.regularPrice = regularPrice;
    }
    public abstract double computeSalePrice();
}
