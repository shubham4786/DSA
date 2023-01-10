package LinkedList.singlyLinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class LinkedList{
    private Node head;

    void push(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            //goto Last node
            while(temp.next != null){
                temp = temp.next;
            }

            //connect last node to newNode
            temp.next = newNode;
        }
    }

    int pop(){

        //List is empty
        if(head == null){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        //List contains single element
        if(head.next == null){
            int delValue = head.data;
            head = null;
            return delValue;
        }

        //Rest of the cases
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }

        int delValue = temp.next.data;
        temp.next = null;
        return  delValue;
    }

    boolean isEmpty(){
//        if(head == null)
//            return true;
//        else
//            return false;
        return head == null;
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

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        System.out.println(myList.isEmpty());
        myList.push(10);
        myList.push(20);
        myList.push(30);
        myList.push(40);
        myList.print();

        System.out.println(myList.pop());
        myList.push(100);
        myList.print();
        System.out.println(myList.pop());
        System.out.println(myList.pop());
        System.out.println(myList.pop());
        System.out.println(myList.pop());
        System.out.println(myList.pop());

        System.out.println(myList.isEmpty());
    }
}
