class DNode{
    int data;


    DNode next;
    DNode prev;

    DNode(int data){

        this.data=data;
        next=null;
        prev=null;
    }
}
public class DoublyLinkedList {
   public static void main(String[] args) {
        
    DNode head=new DNode(10);
    DNode second=new DNode(20);
    DNode third=new DNode(30);

    head.prev=third;
    head.next=second;
    second.prev=head;

    second.next=third;
    third.prev=second;
    third.next=head;

    System.out.print(head.next.next.next.next.prev.data);

   } 
}













