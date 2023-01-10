package Sort;

public class MergeSort {
    static void merge(int a[], int l, int m, int h){
        int n1 = m-l+1;
        int n2 = h-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        //Copy values from a to L
        for(int i=0; i<n1; i++){
            L[i] = a[l+i];
        }

        //Copy values from a to R
        for(int i=0; i<n2; i++){
            R[i] = a[m+1+i];
        }


        //Merge back the values from L and R to a
        int i=0;
        int j=0;
        int k=l;


        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                a[k++] = L[i++];
            }
            else{
                a[k++] = R[j++];
            }
        }

        while(i<n1){
            a[k++] = L[i++];
        }

        while(j<n2){
            a[k++] = R[j++];
        }
    }

    static void divide(int a[], int l, int h){
        int m = l + (h-l)/2;

        if(l < h){
            divide(a, l, m);
            divide(a, m+1, h);
            merge(a, l, m, h);
        }

    }

    public static void main(String[] args) {
        int a[] = {5, 2, 1, 7, 3, 9, 6, 4};
        int n = a.length;

        divide(a, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}

