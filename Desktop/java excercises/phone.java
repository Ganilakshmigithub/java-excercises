import java.util.Scanner;
public class phone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String regex = "\\d{10}";
         System.out.println("enter phone number: ");
            String phone=sc.nextLine();
            if(phone.matches(regex)){
                System.out.println("valid phone number");
            }
            else{
                System.out.println("invalid phone number");
            }
            }
    }

