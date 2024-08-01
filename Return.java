/*The void keyword, used in the examples above, indicates 
that the method should not return a value. 
If you want the method to return a value, you can 
use a primitive data type (such as int, char, etc.)
 instead of void, and use the return keyword inside 
 the method:*/

public class Return {
    public static void main(String[] args) {
        int z = mymethod(5, 3);
        char fname = 'z'; // Assuming you want to assign 'z' to fname, but you can change it accordingly
        method2(fname);
        System.out.printf("%d %c", z, fname);
    }

    public static int mymethod(int x, int y) {
        return x + y;
    }

    public static char method2(char name) {
        return (name);
    }
}
 