import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExpressionClass {
    public static void main(String[] args) {
        Pattern p=Pattern.compile(".xx.");
        Matcher m=p.matcher("AxxB");
        boolean b=m.find();
        if(b){
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
    }
}
