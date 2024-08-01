//do-while loop, which is a type of loop that executes the statements within the block first and then checks the loop condition. The loop will continue executing as long as the condition inside the while statement is true.

public class Do_while {
    public static void main(String[] args) {
        int i = 1;
        do
        {
            System.out.println(i);
            i++;
        }
        while
        (i < 6);
    }
}
/*Inside the do block:
System.out.println(i);: Prints the current value of i to the console.
i++;: Increments the value of i by 1.
After the do block, there is a while (i < 6); statement that checks the condition i < 6. If the condition is true, the loop will repeat; otherwise, it will exit.*/