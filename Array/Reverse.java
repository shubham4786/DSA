package Array;
//Printing in Reverse Order
public class Reverse {
    public static void main(String[] args) {
        int a[] = {20, 2, 5, 10, 7};
        int n = a.length;

        for(int i=n-1; i>=0; i--)
            System.out.print(a[i] + " ");

    }
}
