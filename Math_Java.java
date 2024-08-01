public class Math_Java {
    public static int mymethod(int a, int b)
    {
        return Math.max(a,b);

    }
    public static float mymethod(float c, float d)
    {
        return Math.min(c,d);

    }

    public static double mymethod2(int g) {
        return Math.sqrt(g);
    }


    public static void main(String[] args) {

        System.out.println( mymethod(5,10));
        System.out.println(mymethod(6.0f, 9.0f));
        System.out.println(mymethod2(3));
    }
}