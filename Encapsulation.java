public class Encapsulation {
    private String name;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class test
{
    public static void main(String[] args)
    {
        Encapsulation myMethod = new Encapsulation();
        myMethod.setName("Manoj");
        System.out.println(myMethod.getName());
    }
}