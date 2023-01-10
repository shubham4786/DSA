package Math;

public class EuclidGCD {
    public static void main(String[] args) {
        int x = 14;
        int y = 7;

        int a = x;
        int b = y;

        int gcd = 1;
        int lcm = 1;

        while(x>0 && y>0){

            if(x > y){
                x = x%y;
                gcd = y;
            }
            else {
                y = y%x;
                gcd = x;
            }
        }

        lcm = (a*b) / gcd;

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
