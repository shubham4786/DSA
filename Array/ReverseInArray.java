package Array;

public class ReverseInArray {
    public static void main(String[] args) {
        int a[] = {20, 2, 5, 10, 7};
        int n = a.length;

        for(int i=0, j=n-1; i<=n/2; i++, j--){
            //Swap
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        //Print given Array
        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");
    }
}
