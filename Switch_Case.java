public class Switch_Case {
    public static void main(String[] args) {
        char mano = 'M';
//Switch case alternative of condition statement(if else if)
        switch (mano) // switch keyword (variable)
        {
            case 'M': //case- case1
                System.out.println("True");
                break; // to terminate the case process if false every switch conditional statement should contain break
            case 'O':
                System.out.println("letter is there");
                break;
            case 'T':
                System.out.println("not there");
                break;
            default: // alternative for else
                System.out.println("END");
        }
    }
}
