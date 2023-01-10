package SlidingWindow;

public class SumOfEveryKthWindow2 {
    public static void main(String[] args) {
        int a[] = {10, 3, -1, 5, 9, 2, 1};
        int n = a.length;
        int k = 3;


        int sum = 0;

        for (int i = 0; i < n; i++) {

            if (i == k)
                System.out.print(sum + " ");

            sum += a[i];

            if (i >= k) {
                sum -= a[i - k];
                System.out.print(sum + " ");
            }
        }
    }
}
