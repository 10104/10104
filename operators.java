public class operators {
    public static void main(String[] args) {
//arithmetic operator
        int a = 10;
        int b = 4;
        a++; //post increment or post decrement initially gives the output without increment or decrement ( +1/-1)but after that whenever the variable is used it gives the incremented value as output.
        System.out.println(a);
        --b; //pre increment or decrement is opposite of the above.
        System.out.println(b);
        int c = a + b; //addition
        int d = a - b; //subtraction
        int e = a * b; //multiply
        //TYPE CASTING changing one data type to other
        float f = a / b; //division this is implicit conversion the system itself take it as integer by own a and b are in int as the variable is in float datatype the result is also taken as float.
        float g = (float)a / (float)b; //this is explicit datatype here the user changes the datatype of the input variables by his own then the operation takes palce.
        int h = a % b;
        boolean i = true;
        boolean j = true;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        //relational operator prints OP as true or false (boolean)
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b); //checks weather the values are equal
        System.out.println(a!=b); //checks the values are not equal

//logical operator - and(&&) or (||) not (!) operators(prints bollean value)

        System.out.println(i&&j);//both the inputs must be true then only the op will be true or else it will be false
        System.out.println(i||j); // atleast one input must be true then the op will be true if all the inputs are false (0) then the op will also be false
        System.out.println(!i); // prints the output opposite to the input bollean value. 1-0,0-1

//OPERATOR PRECEDENCE
//for arithmetic operator * / has the frst preference and then the + -
//for logical operator not (!) has the frst preference then comes the and (&&) and or (||) operator

    }
}
