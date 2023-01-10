package Sort;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {5, 2, 1, 7, 3};
        int n = a.length;

        for(int i=0; i<n; i++){
            int key = a[i];
            int j = i-1;
            for ( ; j >= 0; j--) {
                if (a[j] >= key) {
                    a[j + 1] = a[j];
                } else {
                    a[j + 1] = key;
                    break;
                }
            }
            if (j < 0) {
                a[0] = key;
            }
        }
        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");
    }
}
