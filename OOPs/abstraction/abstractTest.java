package OOPs.abstraction;

abstract class vehicle{
    void horn(){
        System.out.println("popopoooo");
    }

    abstract  void brakes();

}

class bike extends vehicle{
    void brakes(){
        System.out.println("Disk brakes");
    }
}

public class abstractTest {
    public static void main(String[] args) {
        vehicle v = new vehicle() {
            void brakes() {
                System.out.println();

            }
        };
        v.brakes();

    }

}
