class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}
class InSufficeintQuantityException extends Exception {
    public InSufficeintQuantityException(String message) {
        super(message);
    }
}
public class Exception2 {
    int quantity;
    String name;
    int price;
    public Exception2(int quantity, String name, int price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }
    public void sale(int sell) throws InvalidQuantityException, InSufficeintQuantityException {
        if(sell<0){
            throw new InvalidQuantityException("Invalid Quantity");
        }
        if(sell>quantity){
            throw new InSufficeintQuantityException("Insufficient Quantity");
        }
        quantity -= sell;
        System.out.println("Sold " + sell + " " + name + "s");
}
public void purchase(int buy) throws InvalidQuantityException {
    if(buy<0){
        throw new InvalidQuantityException("Invalid Quantity");
    }
    quantity += buy;
    System.out.println("Bought " + buy + " " + name + "successfully");
}
public static void main(String[] args) {
    Exception2 e=new Exception2(10,"Pen",10);
    try {
        e.sale(3);
        e.purchase(4);
        e.sale(0);
        e.sale(12);
    } catch (InSufficeintQuantityException m) {
        System.out.println(m.getMessage());
    } catch (InvalidQuantityException n) {
        System.out.println(n.getMessage());
    }
    try{
        e.purchase(-2);
    } catch (InvalidQuantityException n) {
        System.out.println(n.getMessage());
    }
}
}
