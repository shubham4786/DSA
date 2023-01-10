package HashMaps;



import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();

        myMap.put(2, "Shubham");
        myMap.put(9, "Priya");
        myMap.put(5, "Prasanna");
        myMap.put(8, "Jay");
        myMap.put(2, "abc");

        for(Map.Entry<Integer, String> entry : myMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
