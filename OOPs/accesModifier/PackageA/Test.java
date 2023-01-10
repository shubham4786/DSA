package OOPs.accesModifier.PackageA;


class Animal{
    int legs;

    void eat(){
        System.out.println("EATINGGGGG!!");
    }
}

class Dag extends  Animal{
    void  fun(){
        int  l = legs;
        eat();
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a =new Animal();
        int l = a.legs;
        a.eat();
    }
}
