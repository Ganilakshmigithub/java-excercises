import java.util.Scanner;
class facfun{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        int factors=factorsfind(n);
        System.out.println("factors are: "+factors);
    }
    public static int factorsfind(int n){
        int largest=1;
        for(int i=n/2;i>=1;i--){
            if(n%i==0) {
                largest=i;
                break;
            }
        }
    return largest;
}
}

