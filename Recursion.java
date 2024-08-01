/*Recursion is the technique of making a function call itself. This technique provides a way to break
complicated problems down into simple problems which are easier to solve.

Recursion may be a bit difficult to understand. The best way to figure out how it works is to
experiment with it.*/

public class Recursion {
    public static void main(String[] args)
    {
       System.out.println( mymethod(10));
    }

    public static int mymethod(int k)
    {
        if(k>0)

        {

            return k +mymethod(k-1);
        }
        else
        {
            return 0;
        }
    }
}
/*When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k and returns
the result. When k becomes 0, the function just returns 0. When running, the program follows these steps:*/
