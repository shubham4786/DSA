package OOPs.Inheritance.Hierarchical;

class Animal{
    int legs;
    void eat(){
        System.out.println("EATINGGGGGGG!!!");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("BARKINGGGG!!!");
    }
}

class Cat extends Animal {
    void meow(){
        System.out.println("MEOWWWWWWW!!!");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
