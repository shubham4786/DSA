package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {10, 12, 40, 57, 90, 105, 200, 245};
        int n = a.length;
        int x = 201;


        int l = 0;
        int r = n-1;

        while(l<=r){
            int m = l + (r-l)/2;

            if(a[m] == x){
                System.out.println("Element found at index: " + m);
                break;
            }
            else if(x < a[m])
                r = m-1;
            else
                l = m+1;
        }

        if(l>r)
            System.out.println("Element not found!!");
    }
}
