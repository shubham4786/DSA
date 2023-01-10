package Array;
import java.util.*;

public class Mergearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];
        int c[] = new int[n+m];

        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        for(int j=0; j<m; j++)
            b[j] = sc.nextInt();


        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
//            if(a[i] == b[j]){
//                c[k++] = a[i++];
//                c[k] = b[j]; j++; k++;
//            }
            if(a[i] < b[j]){
                c[k++] = a[i++];
            }
            else{
                c[k++] = b[j++];
            }
        }


        while(i<n){
            c[k++] = a[i++];
        }

        while(j<m){
            c[k++] = b[j++];
        }


        for(k=0; k<n+m; k++)
            System.out.print(c[k] + " ");
    }
}
