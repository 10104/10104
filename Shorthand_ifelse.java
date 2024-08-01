/*Short Hand If...Else
There is also a shorthand if else, which is known as
the ternary operator because it consists of three operands.
It can be used to replace multiple lines of code with
a single line, and is most often used to replace simple if else statements
? = is true , : is false;
SYNTAX
variable = (condition) ? expressionTrue :  expressionFalse;
 */
public class Shorthand_ifelse {
    public static void main(String[] args) {
int a= 10;
int b = 5;
String c =(a==b)? "goodbye" : "hello" ;
System.out.println(c);
    }
}
