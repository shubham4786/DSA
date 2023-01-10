package HashMaps;

import java.util.HashMap;
import java.util.Map;
public class FrequencyCount {
    public static void main(String[] args) {
        int a[] = {1, 7, 10, 1, 7, 7, 9};
        int n = a.length;

        HashMap<Integer, Integer> myMap = new HashMap<>();

        for(int i=0; i<n; i++){
            int num = a[i];
            if(!myMap.containsKey(num)){
                myMap.put(num, 1);
            }
            else {
                int count = myMap.get(num);
                myMap.put(num, count+1);
            }
        }

        for(Map.Entry<Integer, Integer> entry :  myMap.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

    }
}
