import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> myObj = new HashMap<>();
        myObj.put("Ram", 55);
        myObj.put("Manoj", 60);
        myObj.replace("Ram", 50);
        for (String i : myObj.keySet()) {
            System.out.println("key: " + i + " value: " + myObj.get(i));

        }
    }
}
