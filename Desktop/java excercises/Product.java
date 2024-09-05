public class Product {
    String name;
    static int taxrate = 18;
    int price;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public int gettax(){
        return price*taxrate/100;
    }
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        System.out.println("Tax rate for the product is: "+p1.gettax());
    }
}
