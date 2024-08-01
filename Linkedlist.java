import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[]args)
    {
        LinkedList<String> myObj = new LinkedList<>();
        myObj.add("Volvo");
        myObj.add("Audi");
        myObj.add("Shift");
        myObj.addFirst("Tata");
        System.out.println(myObj.size());
    }
}
