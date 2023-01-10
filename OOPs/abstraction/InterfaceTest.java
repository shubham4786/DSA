package OOPs.abstraction;

interface Animal{

    String msg = "Animal Class";

    void eat();
    void sleep();
    void walk();
}

class Dog implements Animal{
    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }

    public void walk() {
        System.out.println("Walking");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        Animal a = new Animal() {
            public void eat() {

            }

            public void sleep() {

            }

            public void walk() {

            }
        };

        System.out.println(a.msg);



    }
}
