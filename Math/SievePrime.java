package Math;

public class SievePrime {
    public static void main(String[] args) {
        int n = 100;

        int m = n+1;
        boolean prime[] = new boolean[m];
        for (int i = 0; i < m; i++) {
            prime[i] = true;
        }

        prime[0] = false;
        prime[1] = false;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(prime[i]){
                for(int j=i*i; j<m; j=j+i){
                    prime[j] = false;
                }
            }
        }

        for(int i=0; i<m; i++){
            if(prime[i])
                System.out.print(i + " ");
        }

    }
}
