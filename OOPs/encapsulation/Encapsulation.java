package OOPs.encapsulation;

class Student{
    private int rollNo;
    private String name;
    private int age;

    // constructor
    Student(){
        System.out.println("A new Student is Registered");
    }

    // constructor with parameter
    Student(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    //    public void setRollNo(int rollNo){
//        this.rollNo = rollNo;
//    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age > 0)
            this.age = age;
        else
            System.out.println("Age cannot be Negative!!!");
    }

    public int getRollNo(){
        return rollNo;
    }
    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }

    public void printDetails(){
        System.out.println("Details are: ");
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Student stud1 = new Student(101, "Ravinder", 24); // Object
        stud1.setAge(30);
        stud1.printDetails();
    }
}
