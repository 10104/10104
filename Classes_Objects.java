//To create a class, use the keyword "class"
//To create an Object - class name object name = new class name
public class Classes_Objects { // initialize class
    String name;//field members of class
    int rollno=10; //initial attribute value
//if u dont want to change the attribute value set as final.
    public  void display() // methods members of class
    {
        System.out.println(name);
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        Classes_Objects myapform  = new Classes_Objects(); // initializing object
        Classes_Objects myapform2 = new Classes_Objects();// initializing multiple objects
        myapform.name = "manoj"; //initializing values to the attributes / fields
        myapform2.rollno= 39; //modified attribute value
        myapform.display(); // method calling - object name.method name
        myapform2.display();
    }

}
