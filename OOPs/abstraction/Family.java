package OOPs.abstraction;

class GrandFather{
    void play(){
        System.out.println("Play");
    }
}

interface GrandMother{
    void sing();
}

interface Mom extends GrandMother{
    void Paint();
    void Eat();
}

interface Dad {
    void Drive();
    void Eat();
}

class child extends GrandFather implements Mom, Dad{

    public void Paint() {}

    public void Drive() {}

    public void Eat() {}

    public void sing() {}
}

public class Family {
    public static void main(String[] args) {

    }
}
