public class Jump_Statements {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=10;i++)
        {
            if(i==5)
                break;//it terminates before the condition satisfies and comes out of the loop
            if(i==5)
                continue; // it eliminates the exact value of the condition thn prints the rest of the values.
            System.out.println(i);
        }
    }
}
