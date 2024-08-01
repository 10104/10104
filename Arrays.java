public class Arrays {
    public static void main(String[] args) {
 //ARRAYS - collection of similar type of data stored in a memory location. Array index starts with zero.
        //arrays stores in a continous memory location
        int[] rollno=new int[50]; // intializing array
        int[][] matrix=new int[5][4];//intializing multi dimentional array
        rollno[3]=5;//initializing value to the 3 index memory location
        for(int i=0;i<50;i++)
        {
            System.out.println(rollno[i]);
        }
    }
}
