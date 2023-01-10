package Array;

public class product {
    public static void main(String[] args) {
        int a[] = {20, 2, 5, 10};
        int n = a.length;

        int prod = 1;

        for(int i=0; i<n; i++)
            prod = prod * a[i];

        System.out.println(prod);
    }
}
