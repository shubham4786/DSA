package HashMaps;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> myMap = new TreeMap<>();

        myMap.put(2, "Shubham");
        myMap.put(9, "Priya");
        myMap.put(5, "Prasanna");
        myMap.put(8, "Jay");

        for(Map.Entry<Integer, String> entry : myMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
