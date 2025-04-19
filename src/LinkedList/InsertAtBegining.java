package LinkedList;

public class InsertAtBegining{

    static  class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

//    public void insertAtBegining(Node node, int value){
//
//    }
    public static void printList(Node head){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println("null");
    }

    public static Node createLinkedList(Node head, int data){
        Node temp=head;
        temp.data= data;
        temp.next=null;

        return temp;


    }
    public static void main(String[] args) {

//        Node first=new Node(10);
//        Node second= new Node(20);
//        Node third= new Node(30);
//
//        first.next=second;
//        second.next=third;

        Node head=null;
        createLinkedList(head,10);
        createLinkedList(head,20);
        createLinkedList(head,30);

        printList(first);

    }
}
