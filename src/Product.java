public class Product {
    private String desc;
    private double RRP;

    public Product(String desc, double RRP){
        this.desc = desc;
        this.RRP = RRP;
    }

    public double getPrice(){
        return this.RRP;
    }

    public int getBarcode(){
        return new String(this.desc).hashCode();
    }
}
