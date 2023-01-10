package LinkedList.doublyLinkedList;



class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class DoublyLinkedList{
    private Node head;
    private Node tail;

    boolean isEmpty(){
        return (head == null && tail == null);
    }

    void pushLast(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void pushBegin(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void pushPos(int data,  int pos){
        int size = getSize();
        if(pos > size+1) {
            System.out.println("Error: List has only " + size + " elements!!");
            return;
        }

        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else if(pos == 1){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;


        }
        else if(pos == size+1){
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;

        }
        else{
            Node temp = head;
            for(int i=1; i<pos-1; i++){
                temp = temp.next;
            }

            newNode.next = temp.next;
            newNode.next.prev = newNode;
            newNode.prev = temp;
            temp.next=newNode;
        }


    }

    int popLast(){
        //List is empty
        if(isEmpty()){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        //Single Element
        if(head!= null && head == tail){

            int delVal = head.data;
            head = null;
            tail = null;
            return delVal;
        }

        int delVal = tail.data;
        tail = tail.prev;
        tail.next = null;
        return delVal;
    }

    int popBegin(){
        //List is empty
        if(isEmpty()){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        //Single Element
        if(head!= null && head == tail){
            int delVal = tail.data;
            head = null;
            tail = null;
            return delVal;
        }

        int delVal = head.data;
        head = head.next;
        head.prev = null;
        return delVal;
    }

    int popPos(int pos){
        int size = getSize();
        if(pos > size){
            System.out.println("Error: List has only " + size + " elements!!");
            return -1;
        }

        //Single Element
        if(head.next == null && head == tail) {
            int delValue = head.data;
            head = null;
            tail = null;
            return delValue;
        }
        if(pos==1){
            int delVal = head.data;
            head = head.next;
            head.prev = null;
            return delVal;
        }
        if(pos == size){
            int delVal = tail.data;
            tail = tail.prev;
            tail.next = null;
            return delVal;

        }


        Node temp = head;
        for(int i=1; i<pos-1; i++){
            temp = temp.next;
        }
        int delValue = temp.next.data;
        temp.next=temp.next.next;
        temp.next.prev=temp;
        return delValue;
    }


    int getSize(){
            int count = 0;
            Node temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }


    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp);
    }
}

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.pushLast(10);
        myList.pushLast(20);
        myList.pushLast(30);
        myList.print();

//        myList.popPos(4);

        myList.pushPos(40, 1);



        myList.print();

//        System.out.println(myList.popBegin());
//        System.out.println(myList.getSize());
        myList.print();



    }
}
