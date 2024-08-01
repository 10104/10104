public class Iteration {
    public static void main(String[] args) {
        //FOR LOOP - if the check value is initialized by the user then for loop is used.
        int n = 5;
        int f = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) //it loops or iterates till the condition become false
        //for keyword(initialize variable;condition;updation(increment or decrement)
        {
            f = f * i;
            sum += f;

            System.out.println(sum);

        //WHILE LOOP codition is checked at the entry point then the operation takes palse if thee condition is true
           //if the check value is not initialized by the user then while loop is used
            while (i < n) //keyword(condition)
            {
                sum += i; //statement
                i++; //iteration inside the statement
            }
            System.out.println(sum);

        //DO WHILE LOOP in this the operation takes palce atleast one time then only the condition is checked while exiting
            do {
                sum+=i; //statement
                i++; //iteration
            }
            while(i<=n);//condition
            System.out.println(sum);

        }
        }
    }