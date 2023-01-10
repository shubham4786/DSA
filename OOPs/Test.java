package OOPs;

import java.util.Scanner;

class Student{
    int rollNo;
    String name;
    int age;

    void message(){
        System.out.println("Hello Everyone");
    }

    void setRollNo(int r){
        rollNo = r;
    }

    String getName(){
        return name;
    }

    void printDetails(){
        System.out.println("Details are: ");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rollNo = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int age = sc.nextInt();


        Student stud1 = new Student();
        stud1.setRollNo(rollNo);
        stud1.name = name;
        stud1.age = age;

        stud1.message();
        stud1.printDetails();

    }
}