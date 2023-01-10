package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {10, 50, 70, 5, 9, 100};
        int n = a.length;
        int x = 9;

        int i = 0;
        for( ; i<n; i++){
            if(a[i] == x){
                System.out.println("Element found at index: " + i);
                break;
            }
        }

        if(i == n)
            System.out.println("Element not found!!");
    }
}
