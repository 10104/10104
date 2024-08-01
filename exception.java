import java.util.ArrayList;
public class exception
{
    public static void main(String[] args)
    {
        ArrayList<Integer> myObj = new ArrayList<>();
        myObj.add(1);
        try
        {
            if(myObj.size()!=5)
            {
                throw new ArithmeticException("Size not equal");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("\nTry catch is over");
        }

    }
}
