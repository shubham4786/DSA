package Sort;

public class QuickSort {
    static int partition(int a[], int l, int h){

        //First element as pivot
        int pivot = a[l];
        int i = l+1;
        int j = h;

        do {
            while (i <= h && a[i] <= pivot) {
                i++;
            }

            while (j >= l && a[j] > pivot) {
                j--;
            }

            if (i < j) {
                //swap a[i] and a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        } while(i < j);

        //swap pivot and a[j]
        int temp = a[l];
        a[l] = a[j];
        a[j] = temp;

        return j;
    }

    static void quickSort(int a[], int l, int h){

        if (l<h) {
            int p = partition(a, l, h);
            quickSort(a, l, p - 1);
            quickSort(a, p + 1, h);
        }
    }

    public static void main(String[] args) {
        int a[] = {5, 2, 1, 7, 3, 9, 6, 4};
//        int a[] = {6, 10, 4, 2};
//        int a[] = {2, 10};
        int n = a.length;

        quickSort(a, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
