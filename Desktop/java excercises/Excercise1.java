public class Excercise1 {
    String name;
    int price;
    int qoh;
    public Excercise1(String name, int price, int qoh) {
        this.name = name;
        this.price = price;
        this.qoh = qoh;
    }
        public void SetPrice(int price){
            this.price = price;
        }
        public int getnetprice(){
            return price*18/100;
    }
    public void sale(int qty){
        if(qty<=qoh){
            qoh = qoh-qty;
            System.out.println("Sold "+qty+" "+name+"s");
        }
        else{
            System.out.println("Insufficient Quantity");
        }
    }
    public void purchase(int qty){
        qoh = qoh+qty;
        System.out.println("Purchased "+qty+" "+name+"s");
    }
}
class Employee{
    public static void main(String[] args) {
        Excercise1 e1 = new Excercise1("Laptop", 50000, 10);
        System.out.println("Net Price: "+e1.getnetprice());
        e1.sale(6);
        e1.purchase(5);
    }
}