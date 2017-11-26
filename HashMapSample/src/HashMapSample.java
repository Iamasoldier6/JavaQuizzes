import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Java", 1);
        map.put("C++", 2);
        map.put("Python", 3);
        map.put("JavaScript", 4);
        map.put("C", 5);
        map.put("PHP", 6);
        map.put("Golang", 7);
        map.put("Ruby", 8);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
