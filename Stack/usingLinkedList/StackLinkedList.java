package Stack.usingLinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class Stack{
    Node top;

    void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!");
            return -1;
        }
        int delVal = top.data;
        top = top.next;
        return delVal;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!");
            return -1;
        }
        return top.data;
    }

    boolean isEmpty(){
        return top == null;
    }

    void print(){
        Node temp = top;
        while (temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp);
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        myStack.push(60);

        myStack.print();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        myStack.push(100);
        myStack.push(200);
        myStack.push(300);

        myStack.print();

        System.out.println("Top => " + myStack.peek());
    }
}
