import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Stringjoin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> words=new ArrayList<>();
        while(true){
            System.out.println("enter string:");
            String s=sc.nextLine();
            if(s.equalsIgnoreCase("end")){
                break;
            }
            words.add(s);
        }
            String result=String.join("-",words);
            System.out.print(result);
    }
}