//Datatypes - primitive / reference

//PRIMITIVE DATA TYPES - Stores the data in the allocated memory address location.
//Data      TypeSize	    Description
//byte	    1 byte	        Stores whole numbers from -128 to 127
//short	    2 bytes	        Stores whole numbers from -32,768 to 32,767
//int	    4 bytes	        Stores whole numbers from -2,147,483,648 to 2,147,483,647
//long	    8 bytes	        Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//float	    4 bytes	        Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//double    8 bytes	        Stores fractional numbers. Sufficient for storing 15 decimal digits
//boolean	1 bit	        Stores true or false values
//char	    2 bytes	        Stores a single character/letter or ASCII values

import java.awt.Point;
public class Datatype {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        a = 6;

        System.out.println(a);
        System.out.println(b);


        Point p1 = new Point(5,7);
        Point p2 = p1;
        p1.x = 7;
        System.out.println(p1);
        System.out.println(p2);
    }
}


//Difference btwn Primitive and reference
//in primitive the data stored in the specific memory location wont be changed if new value is given to the same variable the value will be allocated in another memory location the value in the previous memory location wont be changed.
//but in reference datatype the the changed value will be allocated to the same previous location referenced by the user.

//REFERENCE DATATYPE - Its not a pre determined datatype like primitive it is referenced by the user.
// datatype variable = new(keyword) datatype (values)


