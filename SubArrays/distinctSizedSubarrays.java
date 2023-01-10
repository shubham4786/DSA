package SubArrays;

import java.util.*;

public class distinctSizedSubarrays {

    static int maxSubsetSize(int arr[], int N, int K) {
        int ptr = 0;
        HashSet<Integer> s = new HashSet<Integer>();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
            if (sum < K) {
                continue;
            }
            if (sum > K) {
                while (sum > K) {
                    sum -= arr[ptr++];
                }
            }

            if (sum == K) {
                s.add(i - ptr + 1);
                int t = ptr;

                while (arr[t] == 0) {
                    s.add(i - t);
                    t++;
                }
            }
        }

        return s.size();
    }



    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0 };
        int N = arr.length;
        int K = 2;

        System.out.println(maxSubsetSize(arr, N, K));
    }
}
