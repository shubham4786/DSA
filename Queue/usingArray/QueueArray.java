package Queue.usingArray;

class Queue{
    private int MAX_SIZE = 5;
    private int queue[] = new int[MAX_SIZE];
    private int front = -1;
    private int rear = -1;

    void enqueue(int data){
        if(rear+1 >= MAX_SIZE){
            System.out.println("Queue has reached its Limit!!");
            return;
        }

        if(isEmpty()){
            front = 0;
            rear = 0;
        }
        else {
            rear++;
        }

        queue[rear] = data;
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!");
            return -1;
        }
        int delValue = queue[front];
        front++;
        if(front > rear){
            front = -1;
            rear = -1;
        }
        return delValue;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!");
            return -1;
        }
        return queue[front];
    }

    boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    void print(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!");
            return;
        }
        for(int i=front; i<=rear; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}


public class QueueArray {
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
