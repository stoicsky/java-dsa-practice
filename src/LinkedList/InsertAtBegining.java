package LinkedList;

public class InsertAtBegining{

    static  class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    public static Node  insertAtBegining(Node head, int data){

        Node newNode= new Node(data);
        newNode.next=head;

        return newNode;

    }
    public static void printList(Node head){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println("null");
    }


    public static void main(String[] args) {

        Node head=new Node(10);
        Node second= new Node(20);
        Node third= new Node(30);

        head.next=second;
        second.next=third;

        head=insertAtBegining(head,5);
        head=insertAtBegining(head,15);
        head=insertAtBegining(head,55);
        head=insertAtBegining(head,500);
        printList(head);

    }
}
