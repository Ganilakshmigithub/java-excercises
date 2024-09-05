import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers:");
        int sum=0;
        while(true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            sum+=n;
        }
        System.out.println("sum of numbers is: "+sum);
        
    }
}
