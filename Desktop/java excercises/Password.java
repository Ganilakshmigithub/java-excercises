import java.util.Scanner;

public class Password{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter password:");
        String password=sc.nextLine();
        boolean isvalid=validpass(password);
        System.out.println("the password is:"+isvalid);
    }
        public static boolean validpass(String password){
        boolean digit=password.matches(".*\\d.*");
        boolean alpha=password.matches(".*[a-z].*");
        boolean spl=password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
        return digit&&alpha&&spl;
        }
}
