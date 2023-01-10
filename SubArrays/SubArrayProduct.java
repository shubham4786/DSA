package SubArrays;

import java.util.*;

public class SubArrayProduct {
    public static void main(String[] args) {
        long a[] = {1, 5, 2, 3, 6, 4,};
//        long a[] = {22 18 35 49 28 32 27 32 18 28 6 40 47 47 25 19 35 33 6 10 44 14 7 16 35 41 3 6 37 19 20 45 6 20 45 46 25 2 41 29 37 1 1 46 15 2 1 21 10 26};

        long n = a.length;
        long k = 4;

//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        long a[] = new long[n];
//        for(int i=0; i<n; i++)
//            a[i] = sc.nextLong();

        ArrayDeque<Long> myDQ = new ArrayDeque<>();
        for(int i=0; i<k; i++){
            if(myDQ.isEmpty())
                myDQ.addLast(a[i]);
            else{
                while(!myDQ.isEmpty() && myDQ.peekLast() <= a[i]){
                    myDQ.removeLast();
                }
                myDQ.addLast(a[i]);
            }
        }

        long max = myDQ.peekFirst();
        long prod = max;
        long m = 1000000007;

        for(int i=(int)k; i<n; i++){
            if(myDQ.peekFirst() == a[i-(int)k]){
                myDQ.removeFirst();
            }

            if(myDQ.isEmpty())
                myDQ.addLast(a[i]);
            else{
                while(!myDQ.isEmpty() && myDQ.peekLast() <= a[i]){
                    myDQ.removeLast();
                }
                myDQ.addLast(a[i]);
            }

            max = myDQ.peekFirst();
            long x = (prod%m);
            long y = (max%m);
            long p = (x * y);
            prod =  p % m;
        }

        System.out.println(prod);
    }
}
