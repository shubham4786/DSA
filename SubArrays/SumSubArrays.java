package SubArrays;

public class SumSubArrays {
    public static void main(String[] args) {
        int a[] ={0, 1, 2, 3};
        int n=a.length;

//        for(int s=0; s<n; s++){
//            for(int e=s; e<n; e++){
//                int sum=0;
//                for(int i=s; i<=e; i++){
//                    sum +=a[i];
//                    System.out.print(a[i]+" ");
//                }
//                System.out.println("==>"+sum);
//            }
//        }


        for(int s=0; s<n; s++){
            int sum=0;
            for(int e=s; e<n; e++){
                sum +=a[e];

                System.out.println("==>"+sum);
            }
        }
    }
}
