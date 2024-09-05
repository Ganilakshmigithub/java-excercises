public class SimpleInterest {
    int amount;
    int rate;
    public SimpleInterest(int amount, int rate){
        this.amount = amount;
        this.rate = rate;
    }
    public SimpleInterest(int amount){
        this.amount = amount;
        this.rate = 10;
    }
    public void setRate(int rate){
        this.rate = rate;
    }
    public int getRate(){
        return rate;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
    public int getInterest(){
        return amount*rate/100;
    }
    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest(1000,10);
        si.setRate(10);
        si.setAmount(2000);
        System.out.println("Amount is: "+si.getAmount());
        System.out.println("Rate is: "+si.getRate());
        System.out.println("Interest is: "+si.getInterest());
        
    }

}
