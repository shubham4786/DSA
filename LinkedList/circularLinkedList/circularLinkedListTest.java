package LinkedList.circularLinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class CircularLinkedList{
    Node head;

    void pushLast(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            head.next = head;
        }
        else {
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }
    }

    void pushBegin(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            head.next = head;
        }
        else {
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    void pushPos(int data, int pos){
        int size = getSize();

        if(pos > size+1){
            System.out.println("Error: List has only " + size + "elements!!");
            return;
        }

        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            head.next = head;
        }

        if(pos == 1 ){
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
            head = newNode;
            return;
        }


        //Reach pos 1 node behind the required pos
        Node temp = head;
        for(int i=1; i<pos-1; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }


    int popLast(){

        //List is empty
        if(head == null){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        //List contains single element
        if(head.next == head){
            int delValue = head.data;
            head = null;
            return delValue;
        }

        //Rest of the cases
        Node temp = head;
        while (temp.next.next != head){
            temp = temp.next;
        }

        int delValue = temp.next.data;
        temp.next = head;
        return  delValue;
    }

    int popBegin(){
        //List is empty
        if(head == null){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        int delValue = head.data;
        head = head.next;
        popLast();
        return delValue;
    }

    int popPos(int pos){
        int size = getSize();

        if(pos > size){
            System.out.println("Error: List has only " + size + " elements!!");
            return -1;
        }

        //List contains single element
        if(head.next == head){
            int delValue = head.data;
            head = null;
            return delValue;
        }

        //Pos is 1
        if(pos == 1){
            int delValue = head.data;
            head = head.next;
            popLast();
            return delValue;
        }

        //Reach pos 1 node behind the required pos
        Node temp = head;
        for(int i=1; i<pos-1; i++){
            temp = temp.next;
        }

        int delVal = temp.next.data;
        temp.next = temp.next.next;
        return delVal;

    }

    boolean isEmpty(){
        return head == null;
    }
    int getSize(){
        int count = 0;
        if(isEmpty()){
            return count;
        }

        Node temp = head;
        do{
            count++;
            temp = temp.next;

        }while(temp != head);


        return count;

    }

    void print(){
        if(isEmpty()){
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }while(temp != head);
        System.out.println();
    }
}

public class circularLinkedListTest {
    public static void main(String[] args) {

        CircularLinkedList myList = new CircularLinkedList();
        myList.pushLast(10);
        myList.pushLast(20);
        myList.pushLast(30);
//        myList.pushBegin(50);
//        myList.pushBegin(60);
        myList.print();

//        System.out.println(myList.popPos(1));

        myList.pushPos(100, 1);

//        myList.popLast();
//        myList.popBegin();
//        System.out.println(myList.getSize());

        myList.print();
    }
}
