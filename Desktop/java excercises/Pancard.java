import java.util.Scanner;
public class Pancard {
    final static String Regex="[A-Z]{5}[0-9]{4}[A-Z]{1}";
    public static boolean validpan(String pan){
        if(pan==null||pan.length()!=10){
            return false;
        }
        return pan.matches(Regex);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pan number");
        String pan=sc.next();
        if(validpan(pan)){
            System.out.println("Valid Pan Number");
        }
        else{
            System.out.println("Invalid Pan Number");
        }
        sc.close();
    }
}