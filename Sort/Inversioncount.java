package Sort;

public class Inversioncount {
    static long merge(int a[], int l, int m, int h){
        int n1 = m-l+1;
        int n2 = h-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        long ct=0;

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
                ct+=n1-i;
            }
        }

        while(i<n1){
            a[k++] = L[i++];
        }

        while(j<n2){
            a[k++] = R[j++];
        }
        return ct;
    }

    static long divide(int a[], int l, int h){
        int m = l + (h-l)/2;

        long ct=0;

        if(l < h){
           ct+= divide(a, l, m);
            ct+=divide(a, m+1, h);
            ct+=merge(a, l, m, h);
        }
        return ct;

    }

    public static void main(String[] args) {
        int a[] = {5, 2, 1, 7, 3, 9, 6, 4};
        int n = a.length;



        long ct=divide(a, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\nInversioncount "+ct);
    }
}
