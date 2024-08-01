import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String [] args)
    {
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);
        DateTimeFormatter myObj2 = DateTimeFormatter.ofPattern("DD-YYYY HH:MM");
        String formattedDate = myObj.format(myObj2);
        System.out.println(myObj2);
    }
}
