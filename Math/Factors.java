package Math;

public class Factors {
    public static void main(String[] args) {
        int n = 12;

        int count = 0;

        for(int i=1; i<=n; i++){
            if(n%i == 0) {
                System.out.println(i);
//                count = count + 1;
                count++;
            }
        }

        System.out.println("Total Factors: " + count);
    }
}
