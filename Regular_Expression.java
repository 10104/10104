import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regular_Expression
{
    public static void main(String[] args)
    {
       Pattern myObj = Pattern.compile("MANO",Pattern.CASE_INSENSITIVE);
       Matcher myObj2 = myObj.matcher("mano is good boy");
       boolean matchfound = myObj2.find();
       if(matchfound)
       {
           System.out.println("Match Found");
       }
       else
       {
           System.out.println("Match not found");
       }
    }
}
