//Pascals's triangle
public class Nested_Loop {
    public static void main(String[] args) {
//loop inside a loop is called nested loop
            for(int i=1;i<=5;i++)//here it loops 3 times
            {
                for(int j=1;j<=5;j++) //here it loops 9 times (3x3)
            {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
