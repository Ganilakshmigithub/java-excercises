import java.util.Scanner;
public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Array elements in reverse order are: ");
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
