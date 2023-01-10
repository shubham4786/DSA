package Array;

public class RightRotation {
    public static void main(String[] args) {

        int a[] = {20, 2, 5, 10, 7};
        int n = a.length;
        int k = 5; //No of rotations

        //Rotate k times
        for (int j = 0; j < k; j++)
        {
            //Rotate 1 time
            int temp = a[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                a[i + 1] = a[i];
            }
            a[0] = temp;
        }

        //Print Rotated Array
        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");
    }
}
