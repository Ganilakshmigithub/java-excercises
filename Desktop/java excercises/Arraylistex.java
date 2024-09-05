import java.util.ArrayList;
import java.util.Scanner;
public class Arraylistex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements:");
            int n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<Integer>(n);
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
        }}

}
