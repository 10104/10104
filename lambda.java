import java.util.ArrayList;

public class lambda
{
    public static void main(String[] args)
    {
        ArrayList<Integer> myObj = new ArrayList<>();
        myObj.add(5);
        myObj.add(7);
        myObj.add(11);
        myObj.forEach((n)->{System.out.println(n);});
    }


}
