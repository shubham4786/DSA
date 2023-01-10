package DSA.abc;

public class ll {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=next;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }


    public Node head;
    public Node tail;
    public void insertFirst(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
        //edge case
        if(tail==null){
            tail=head;
        }
    }
    //print the linkedList
    public void print(){
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println(temp);
    }


    public static void main(String[] args) {
        ll list = new ll();
        list.insertFirst(1);

        list.print();
    }


}
