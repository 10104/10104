import  java.util.ArrayList;
public class wrapperclass
{
    public static void main(String[] args) {
        ArrayList<Integer> myObj = new ArrayList<>();
        myObj.add(1);
        myObj.add(234);
        myObj.add(4533);
        myObj.add(9373);
        Integer myInt = 55;
        String myObj2 = myInt.toString();
        System.out.println(myObj);
        System.out.println(myObj2.length());
    }
}
