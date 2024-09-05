import java.util.Scanner;
public class Counter {
    int value;
    static int count=0;
    public Counter(int value){
        this.value = value;
        count++;
    }
    public void increment(){
        value++;
    }
    public void decrement(){
        value--;
    }
    public int getValue(){
        return value;
    }
    public int getCount(){
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int value = sc.nextInt();
        Counter c = new Counter(value);
        System.out.println("Value: "+c.getValue());
        c.increment();
        System.out.println("Value after increment: "+c.getValue());
        c.decrement();
        System.out.println("Value after decrement: "+c.getValue());
        System.out.println("CountAdd functionality to get number of objects created in Counter class. is: "+c.getCount());
        sc.close();
    }
}
