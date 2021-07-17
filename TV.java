public class TV extends Product{
    private String typeTV;

    public String getTypeTV() {
        return typeTV;
    }
    public void setTypeTV(String typeTV) {
        this.typeTV = typeTV;
    }
    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    private double screenSize;
    public TV (int barcode, int regularPrice, String typeTV, double screenSize){
        super(barcode, regularPrice);
        this.typeTV = typeTV;
        this.screenSize = screenSize;
    }
    @Override
    public double computeSalePrice() {
        return getRegularPrice()*1.2;
    }
}