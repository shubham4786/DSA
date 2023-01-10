package SlidingWindow;

public class SumOfEveryKthWindow {
    public static void main(String[] args) {
        int a[] = {10, 3, -1, 5, 9, 2, 1};
        int n = a.length;
        int k=3;



        int sum=0;
        for(int i=0; i<k; i++)
//            sum = sum + a[i];
            sum += a[i];

        System.out.print(sum + " ");


        for (int i=k; i<n; i++){
            sum += a[i];
            sum -= a[i-k];

            System.out.print(sum + " ");
        }


    }
}
