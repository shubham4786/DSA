package OOPs.accesModifier.PackageB;

import OOPs.accesModifier.Animal;

class cat extends Animal{
    void fun(){
        int x =legs;
        eat();
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
//        int l = a.legs;
           a.eat();

    }
}
