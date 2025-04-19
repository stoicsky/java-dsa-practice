package LinkedList;

public class CreateAndPrintList {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    static void printList(Node head){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        Node first= new Node(10);
        Node second= new Node(20);
        Node third= new Node(30);

        first.next=second;
        second.next=third;

        //Head points to first
        Node head=first;

        printList(head);
    }
}
