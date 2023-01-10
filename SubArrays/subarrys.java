package SubArrays;

public class subarrys {
    public static void main(String[] args) {
        int a[]={0, 1, 2, 3};
        int n = a.length;

        for(int s=0; s<n; s++){
            for(int e=s; e<n; e++){
                for(int i=s; i<=e; i++){
                    System.out.print(a[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
