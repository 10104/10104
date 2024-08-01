//A static method means that it can be accessed without creating an object of the class,
// unlike public

public class Static {
    static void MyName()
    {
        System.out.println("Manoj");
    }
    public int RollNo(int rollno)
    {
        return rollno;
    }

    public static void main(String[] args) {
        MyName();
        Static MyName = new Static();
        System.out.println(MyName.RollNo(5));

    }
}
