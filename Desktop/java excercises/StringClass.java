import java.util.Scanner;
public class StringClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        System.out.println("The string is: "+s);
        StringBuilder sb=new StringBuilder(s);
        System.out.println("The reverse of the string is: "+sb.reverse());
    }
}
