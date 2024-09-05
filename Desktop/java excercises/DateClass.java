import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateClass {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today's date is: " + date);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String s=dtf.format(date);
        System.out.println("Formatted date is: "+s);

    }
}
