package bitManipulation;

public class Test {
    public static void main(String[] args) {

//        int x = 14;
//
//        //Multiply by 2
//        System.out.println(x << 1);
//
//        //Divide by 2
//        System.out.println(x >> 1);
//
//        //Even Or Odd
//        if((x & 1) == 0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }


        //Set Bit
        int y = 38;
        int n = 5;
//        System.out.println(y | (1 << n));
//
//        //UnSet Bit
//        System.out.println(y & (~(1 << n)));


        //Toggle Bit
        System.out.println(y ^ (1 << n));
    }
}
