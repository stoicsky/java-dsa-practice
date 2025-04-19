package LinkedList;

public class InsertAtEnd {

    //Node class
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=next;
        }
    }

    //Insert at end logic
    static Node insertAtEnd(Node head,int data){
        Node newNode= new Node(data);

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }

    //print the list
    static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }


    public static void main(String[] args) {
        Node head= null;
        head=insertAtEnd(head,10);
        head=insertAtEnd(head,20);

        printList(head);
    }


}
