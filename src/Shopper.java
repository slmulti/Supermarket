import java.util.Stack;

public class Shopper {
    private Stack<Product> trolley = new Stack<>();

    public void addProduct(Product product){
        trolley.push(product);
    }

    public Product getProduct(){
        return trolley.pop();
    }

    public boolean hasProducts(){
        return !trolley.isEmpty();
    }
}
