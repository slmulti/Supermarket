import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayDeque;
public class Supermarket {
    private ArrayList<Product> inventory = new ArrayList<>();
    private HashMap<Integer, Integer> stock = new HashMap<>();
    private ArrayDeque<Shopper> checkout = new ArrayDeque<>();
    public Supermarket(){
        //CRUD
        inventory.add(new Product("Coffee", 2.79));
        inventory.add(new Product("Tea", 1.79));
        inventory.add(new Product("Biscuits", 3.79));
        inventory.add(new Product("Milk", 0.79));
        inventory.add(new Product("Oat Milk", 3.10));
        //HASHMAP CRUD
        for(Product product:inventory){
            stock.put(product.getBarcode(), 10);
        }
        Shopper shopper1 = new Shopper();
        Shopper shopper2 = new Shopper();
        shopper1.addProduct(inventory.get(0));
        shopper1.addProduct(inventory.get(0));
        shopper1.addProduct(inventory.get(1));
        shopper2.addProduct(inventory.get(0));
        shopper2.addProduct(inventory.get(1));
        shopper2.addProduct(inventory.get(2));
        shopper2.addProduct(inventory.get(4));
        checkout.addLast(shopper1);
        checkout.addLast(shopper2);

        System.out.println("done");

        processQueue();
    }

    public static void main(String[] args) {
        new Supermarket();
    }

    private void processQueue(){
        while(!checkout.isEmpty()){
            double total = 0;
            Shopper shopper = checkout.pollFirst();
            while(shopper.hasProducts()){
                Product product = shopper.getProduct();
                int barcode = product.getBarcode();
                total += product.getPrice();
                int currentStockValue = stock.get(barcode);
                stock.replace(barcode, currentStockValue-1);
            }
            System.out.printf("Shopper %s total £%.2f\n", shopper.toString(), total);
        }
    }
}
