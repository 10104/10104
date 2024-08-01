/*Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of infinite recursion. Infinite recursion is when the function never stops calling itself. Every recursive function should have a halting condition, which is the
condition where the function stops calling itself. In the previous example, the halting condition is when the parameter k becomes 0.*/



public class Halting {
    public static void main(String[] args) {
        System.out.println(mymethod(5,10));
    }

    public static int mymethod(int start, int end)
    {
        if(end>start)
        {
            return end+mymethod(start,--end);
        }
        else
        {
            return end;
        }
    }
}
