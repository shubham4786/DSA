package Math;

public class FactorsOptimized {
    public static void main(String[] args) {

        int n = 6;

        int m = (int)Math.sqrt(n);
        int count = 0;

        for(int i=1; i<=m; i++){

            if(n%i==0){
                int f1 = i;
                int f2 = n/f1;

                if(f1 == f2){
                    System.out.println(f1 + " ");
                    count++;
                }
                else {
                    System.out.print(f1 + " " + f2 + " ");
                    count += 2;
                }
            }

        }

        System.out.println("\n\nTotal Factors: " + count);
    }
}
