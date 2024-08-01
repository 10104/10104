abstract class Abstract {
    int rollno = 15;
    String fname = "Manoj";
}
class Details extends Abstract
{
    void details()
    {
        System.out.println("My name is  "+ fname +"  My roll no is  "+ rollno );
    }

    public static void main(String[] args) {
        Details myObj = new Details();
        myObj.details();
    }
}
