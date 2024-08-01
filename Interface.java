//An interface in java is a blueprint of a class. It has static
//constants and abstract methods.

interface Interface {
   public void print();
}
interface Character
{
    void type();
}
class MyClass implements Interface, Character
{
    public void print() {
        System.out.print("Manoj ");
    }
    public void type()
    {
        System.out.println("He is a good boy");
    }
}
class Main4 {

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.print();
        myObj.type();
    }
}

