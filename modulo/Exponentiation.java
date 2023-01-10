package modulo;

public class Exponentiation {
//    static int power(int base, int exponent, int m){  //time O(exponent)
//        int prod = 1;
//        for(int i=0; i<exponent; i++){
////            prod = ((prod % m) * (base % m)) % m;
//              prod = prod * base;
//        }
//        return prod;
//    }

    static int powerBetter(int base, int exponent){ // time O(log n)
        int prod = 1;

        while(exponent > 1){
            if(exponent%2 == 1){
                prod = prod * base; //use m
            }

            base = base * base;  //use m
            exponent = exponent/2; //donot use m
        }

        prod = prod * base; // use m
        return prod;
    }

    public static void main(String[] args) {
        int m = 7;

//        System.out.println(power(3, 5, m));
        System.out.println(powerBetter(2, 1));
    }
}
