import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int largest=1;
        for(int i=n/2;i>=1;i++){
            if(n%i==0){
                largest=i;
                break;
            }
        }
        System.out.println("Largest factor of "+n+" is "+largest);
        sc.close();
    }
}
