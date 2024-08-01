public class Foreach_array {
    public static void main(String[] args) {
        String[] cars={"VOLVO","BMW","SHIFT"};
        for (String car : cars)
        {
            if(car.equals("BMW"))
                System.out.println(car);
        }
    }
}
