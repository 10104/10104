import java.util.Iterator;
import java.util.ArrayList;
public class Arraylist_iterator
{
    public static void  main(String []args)
    {
        ArrayList<String> myObj = new ArrayList<>();
        myObj.add("Volvo");
        myObj.add("Tata");
        myObj.add("Ford");
        myObj.remove("Volvo");
        Iterator<String> myObj2 = myObj.iterator();
        int count = 2;
        while(myObj2.hasNext()&&count==2)
        {
            System.out.println(myObj);
            count ++;
        }
        System.out.println(myObj2.hasNext());
        System.out.println(myObj.getFirst());
    }
}
