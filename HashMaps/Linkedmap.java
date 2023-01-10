package HashMaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> myMap = new LinkedHashMap<>();

        myMap.put(2, "Shubham");
        myMap.put(9, "Priya");
        myMap.put(5, "Prasanna");
        myMap.put(8, "Jay");

        for(Map.Entry<Integer, String> entry : myMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
