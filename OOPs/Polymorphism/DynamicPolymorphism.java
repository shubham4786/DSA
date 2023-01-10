package OOPs.Polymorphism;

class vehicle{
    void brakes(){
        System.out.println("Brakes Applied");
    }
}

class bike extends vehicle{
    void brakes() {
        System.out.println("Disk Brakes");
    }
}

class Aeroplane extends  vehicle{
    void brakes(){
        System.out.println("Hydraulic Brakes");
    }
}

public class DynamicPolymorphism {
    public static void main(String[] args) {
//        vehicle v = new vehicle();
//        v.brakes();

//        bike b = new bike();
//        b.brakes();

//        Aeroplane a = new Aeroplane();
//        a.brakes();

//        vehicle v1 = new bike();
//        v1.brakes();
//        vehicle v2 = new Aeroplane();
//        v2.brakes();

        vehicle x;

        x = new Aeroplane();
        x.brakes();
        x = new bike();
        x.brakes();
        x = new vehicle();
        x.brakes();


    }
}
