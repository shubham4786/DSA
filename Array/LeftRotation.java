package Array;

public class LeftRotation {
    public static void main(String[] args) {
        int a[] = {20, 2, 5, 10, 7};
        int n = a.length;
        int k = 1; //No of rotations

        //Rotate k times
        for (int j = 0; j < k; j++)
        {
            //Rotate 1 time
            int temp = a[0];
            for (int i = 0; i < n-1; i++) {
                a[i] = a[i+1];
            }
            a[n-1] = temp;
        }

        //Print Rotated Array
        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");
    }
}
