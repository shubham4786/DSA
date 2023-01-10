package OOPs.Inheritance.MultiLevel;

class Animal{
    int legs;

    void eat(){
        System.out.println("EATINGGGGGGG!!!");
    }
}

class Dog extends Animal {
    int tail;

    void bark(){
        System.out.println("BARKINGGGG!!!");
    }
}

class Puppy extends Dog{
    void sleep(){
        System.out.println("SLEEPINGGGG!!!");
    }
}

public class MultiLevel {

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.sleep();
        p.eat();
        p.bark();

        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
