/*With method overloading, multiple methods can
 have the same name with different parameters: */

public class Method_Overloading {
    public static void main(String[] args){
        int a = mymethod( 8,  5);
        String fname = "My age is:";
        mymethod(fname);
        System.out.printf("%s %d" , fname,a);
    }
    public static int mymethod(int d,int e)
    {
        return d+e;
    }
    public static String mymethod(String fname)
    {
        return fname;
    }

}
/*Multiple methods can have the same name as long as 
the number and/or type of parameters are different. */