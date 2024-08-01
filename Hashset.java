import java.util.HashSet;
public class Hashset
{
    public static void main(String[] args)
    {
        HashSet<Integer> myObj = new HashSet<>();
        myObj.add(6);
        myObj.add(9);
        myObj.add(4);
        myObj.remove(4);
        for (int i = 0; i < 10; i++)
        {
            if(myObj.contains(i))
            {
                System.out.println(i+":" +"True");
            }
            else
            {
                System.out.println(myObj.size());
            }
        }
    }
}
