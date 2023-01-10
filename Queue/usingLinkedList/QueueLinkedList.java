package Queue.usingLinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class Queue{
    Node front = null;
    Node rear = null;

    void enqueue(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            rear = newNode;
            front = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!");
            return -1;
        }
        int delValue = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return delValue;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!");
            return -1;
        }
        return front.data;
    }

    boolean isEmpty(){
        return front == null && rear == null;
    }

    void print(){
        Node temp = front;
        while (temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println(temp);
    }
}

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);
        myQueue.enqueue(70);

        myQueue.print();

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        myQueue.print();

        System.out.println(myQueue.peek());
    }
}
