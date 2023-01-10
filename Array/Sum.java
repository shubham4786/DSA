package Array;

public class Sum {
    public static void main(String[] args) {
    int a[] = {20, 2, 5, 10};
    int n = a.length;

    int sum = 0;

    for(int i=0; i<n; i++)
        sum = sum + a[i];

    System.out.println(sum);
}
}
