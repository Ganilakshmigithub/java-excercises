import java.util.Scanner;
public class Doctor {
    int salary;
    String name1;
    String name2;
    int ratepervisit;
    public Doctor(int salary, String name1,String name2,int ratepervisit){
        this.salary = salary;
        this.name1 = name1;
        this.name2 = name2;
        this.ratepervisit = ratepervisit;
    }
    public void print(){
        System.out.println("Salary: "+salary);
        System.out.println("Resedentail Doctor Name: "+name1);
    }
    public void print2(){
        System.out.println("consultant doctor name: "+name2);
        System.out.println("Rate per visit: "+ratepervisit);
    }
    public int getpay(){
        return salary;
    }
    public int getpay(int visits){
        return ratepervisit*visits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary: ");
        int salary = sc.nextInt();
        System.out.println("Enter the Resedential doctor name: ");
        String name1= sc.next();
        System.out.println("Enter the consultant doctor name: ");
        String name2 = sc.next();
        System.out.println("Enter the rate per visit: ");
        int ratepervisit = sc.nextInt();
        Doctor d = new Doctor(salary, name1, name2, ratepervisit);
        d.print();
        d.print2();
        System.out.println("Resedentail doctors salary: "+d.getpay());
        System.out.println("consultants doctors salary: "+d.getpay(5));
        sc.close();
    }
}
