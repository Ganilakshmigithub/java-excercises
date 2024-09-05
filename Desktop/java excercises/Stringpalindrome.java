import java.util.Scanner;
public class Stringpalindrome {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string:");
    String str=sc.nextLine();
    StringBuilder sb=new StringBuilder(str);
    sb.reverse();
    String rev=sb.toString();
    if(str.equals(rev)){
        System.out.println(str+"is a palindrome string");
    }
    else{
        System.out.println(str+"is not a palindrome string");
    }
sc.close();
}
}
