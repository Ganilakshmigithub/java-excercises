import java.util.Scanner;
public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int s:arr){
            if(s%2==0){
                System.out.println("even numbers are:"+s);
            }
        }
        for(int m:arr){
            if(m%2!=0){
                System.out.println("odd numbers are:"+m);
            }
        }
    
       sc.close();

        
    }
}
