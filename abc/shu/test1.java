package DSA.abc.shu;

public class test1 {
    static int x=10;
    static int y=20;
    public static int m1()
    {
        int z = x + y;
        return z;
    }
    public static double m2()
    {
        int sub = x-y;
        return sub;
    }
    public static void main(String[]args)
    {
        test1 t = new test1();
        System.out.println(t.m1());

        double z =t.m2();
        System.out.println(z);

    }
}
