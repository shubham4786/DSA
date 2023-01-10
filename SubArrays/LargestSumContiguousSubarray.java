package SubArrays;

public class LargestSumContiguousSubarray {
    public static void main(String[] args) {
//        int a[] = {-3, 4, -2, 7, 0, 1};
       int a[] = {-3, -8, -2, -10, -15};

        int n = a.length;

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            sum += a[i];
            max = Math.max(max, sum);

//            if(sum > max)
//                max = sum;

            if(sum < 0)
                sum = 0;
        }

        System.out.println(max);
    }
}
