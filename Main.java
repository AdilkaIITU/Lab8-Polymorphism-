import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // A
        Product tv1 = new TV(123,1000,"Samsung", 30);
        Product tv2 = new TV(456,2000,"Sony", 50);
        Product book1 = new Book(753,60,"Under the sky", "Sun press",1992);
        Product book2 = new Book(951,50,"Java programming", "Springer",2005);
        Product chBook1 = new ChildrenBook(258,20,"Kurtlar", "Morsik",2011, 11);
        Product chBook2 = new ChildrenBook(179,28,"Ormanda", "Morsik",2014, 14);
        ArrayList <Product> arr = new ArrayList<>();
        arr.add(tv1);
        arr.add(tv2);
        arr.add(book1);
        arr.add(book2);
        arr.add(chBook1);
        arr.add(chBook2);

        // B
        for (int i = 0; i < 6; i++) {
            Product product = arr.get(i);
            System.out.println("Barcode: "+product.getBarcode() +"   Price: "+product.computeSalePrice());
        }
        System.out.println();


        // C
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            Product product = arr.get(i);
            sum += product.computeSalePrice();
        }
        System.out.println("total price: " + sum);
        System.out.println();


        // D
        double average = 0;
        int count = 0;
        for (int i = 0; i < 6; i++) {
            ChildrenBook ch = null;
            if (arr.get(i).equals(chBook1) || arr.get(i).equals(chBook2)){
                ch = (ChildrenBook) arr.get(i);
                average += ch.getAge();
                count++;
            }
        }
        average = average/count;
        System.out.println("average age of the children books: " + average);
    }
}
