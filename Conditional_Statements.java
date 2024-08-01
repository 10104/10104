public class Conditional_Statements {
    public static void main(String[] args) {
        int a = 10;
        int b = 13;
        int c = 10;
        if (a==b) // condition (keyword (condition))
        {
            if (a == c) //nested if i.e.if condition given inside one condition it may be if or any other conditions if this condition also satisfies then only the statement will be printed
            {
                System.out.println("a equal to b"); //print statement
            }
        }
        //always the statement should be inside the curley open and close brace then only it will be considered as the statement for the above condition

        else if (b>c)
        {
            System.out.println(" b greater than c ");
        }
        else
        {
            System.out.println("a not equal to b");
        }
        System.out.println("END");
    }
}
// in this if we want to check multipe conditions we have to use if contional statement but if we want check only minimal conditions we have to use if else if conditional statement
// if the if statements are true it only prints the if else if statements and directly prints the last ouput statement if given it will not check the else part
// if the if condition fails then it will check the else if part