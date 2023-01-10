package Math;

public class GCD {
    public static void main(String[] args) {

        int x = 9, y = 12;
        int gcd = 1;
        int lcm = 1;

        int n = 0;

        if(x < y)
            n = x;
        else
            n = y;


        for(int i=1; i<=n; i++){
            if(x%i == 0   &&  y%i == 0){
                gcd = i;
            }
        }

        lcm = (x*y) / gcd;
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);

    }
}
