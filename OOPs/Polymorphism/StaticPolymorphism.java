package OOPs.Polymorphism;

class Area{


    Area(){
    }
    Area(int a){

    }
    Area(float a){}
    Area(int a, int b){}


    //Square
    int calcArea(int side){
        return  side * side;
    }

    // Rectangle
    int calcArea(int length, int breadth){
        return length * breadth;
    }

    //circle
    float calcArea(float radius){
        return (float)(Math.PI * radius * radius);
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println(a.calcArea(4 ,5));
    }
}
