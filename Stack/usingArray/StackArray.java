package Stack.usingArray;

class Stack{
    private int MAX_SIZE = 5;
    private int stack[] = new int[MAX_SIZE];
    private int top = -1;

    void push(int data){
        if(top+1 >= MAX_SIZE){
            System.out.println("Stack has reached its Limit!!");
            return;
        }
        top++;
        stack[top] = data;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!");
            return -1;
        }
        int delVal = stack[top];
        top--;
        return delVal;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!");
            return -1;
        }
        return stack[top];
    }

    boolean isEmpty(){
        return top <= -1;
    }

    void print(){
        for(int i=top; i>=0; i--)
            System.out.print(stack[i] + " ");
        System.out.println();
    }
}


public class StackArray {
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
