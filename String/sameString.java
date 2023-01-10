package String;
import java.io.*;
import java.util.*;

public class sameString {


    static boolean Ana(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        HashMap<Character, Integer> myMap = new HashMap<>();
        for(int i =0; i<str1.length(); i++){
            if(myMap.containsKey(str1.charAt(i))){
                myMap.put(str1.charAt(i), myMap.get(str1.charAt(i))+1);
            }
            else{
                myMap.put(str1.charAt(i), 1);
            }
        }

        for(int i=0; i<str2.length(); i++){
            if(myMap.containsKey(str2.charAt(i))){
                myMap.put(str2.charAt(i), myMap.get(str2.charAt(i))-1);
            }
            else{
                return false;
            }
        }

        Set<Character> keys = myMap.keySet();
        for(Character key : keys){
            if(myMap.get(key) != 0){
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        if(Ana(first, second)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
