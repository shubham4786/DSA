package OOPs.Inheritance.SingleLevel;


class Animal{
    int legs;

    void eat(){
        System.out.println("EATINGGGGGGG!!!");
    }
}

class Dog extends Animal{
    int tail;

    void bark(){
        System.out.println("BARKINGGGG!!!");
    }
}


public class SingleLevel {
    public static void main(String[] args) {
//        Animal a = new Animal();
//        a.eat();

        Dog d = new Dog();
        d.tail = 1;
        d.bark();

        d.legs = 4;
        d.eat();

    }
}
