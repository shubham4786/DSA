package LinkedList.singlyLinkedList2;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class LinkedList{
    private Node head;

    void pushLast(int data){
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
    int popLast(){

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

    void pushBegin(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }
    int popBegin(){
        //List is empty
        if(head == null){
            System.out.println("Error: List is Empty!!");
            return -1;
        }

        int delValue = head.data;
        head = head.next;
        return delValue;
    }

    void pushPos(int data, int pos){
        int size = getSize();
        if(pos > size+1){
            System.out.println("Error: List has only " + size + "elements!!");
            return;
        }

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        if(pos == 1 ){
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
    int popPos(int pos){
        int size = getSize();

        if(pos > size){
            System.out.println("Error: List has only " + size + " elements!!");
            return -1;
        }

        //List contains single element
        if(head.next == null){
            int delValue = head.data;
            head = null;
            return delValue;
        }

        //Pos is 1
        if(pos == 1){
            int delValue = head.data;
            head = head.next;
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

    void reverse(){
        Node pre = head;
        Node cur = pre.next;
        Node pos = null;
        if(cur!=null)
            pos = cur.next;

        while(cur!=null){
            cur.next = pre;
            pre = cur;
            cur = pos;
            if(pos!=null)
                pos = pos.next;
        }

        head.next = null;
        head = pre;
    }

    boolean isEmpty(){
//        if(head == null)
//            return true;
//        else
//            return false;
        return head == null;
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


public class SinglyLinkedListTest2 {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.pushLast(10);
        myList.pushLast(20);
        myList.pushLast(30);
        myList.pushLast(40);
        myList.pushLast(50);
        myList.print();
        myList.pushPos(100, 6);
//        System.out.println(myList.getSize());
//
        myList.print();
//        myList.reverse();
//        myList.print();
    }
}
