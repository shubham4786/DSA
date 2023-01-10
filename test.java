import java.io.*; // for handling input/output
import java.util.*;
public class test {
    static int[] inpt(int n){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    static int median(int a[], int b[], int n, int m){

        int i=0, j=0;
        int m1=-1, m2=-1;

        if((m+n)%2==1){
            for(int c=0; c<=(m+n)/2; c++){
                if(i != n && j != m){
                    m1=(a[i]>b[j]) ? b[j++] : a[i++];
                }
                else if(i<n){
                    m1=a[i++];
                }
                else {
                    m1=b[j++];
                }
            }
            return m1;
        }
        else {
            for(int c=0; c<=(n+m)/2; c++){
                m2=m1;
                if (i != n && j != m) {
                    m1 = (a[i] > b[j]) ? b[j++] : a[i++];
                }
                else if (i < n) {
                    m1 = a[i++];
                }
                else {
                    m1 = b[j++];
                }
            }
            return (m1 + m2) / 2;


        }
    }

    public static void main (String [] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[]=inpt(n);
        int b[]=inpt(m);

         System.out.println(median(a, b, n, m));
    }
}
