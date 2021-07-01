import java.util.List;

class ListNode{
    int data;
    String name;


    ListNode nextRef;

    ListNode(int data, String name){
        this.data=data;
        this.name=name;
        nextRef=null;
    }
}
public class LinkedList2 {

    static ListNode insertIntoList(ListNode head, int data, String name){
        ListNode temp=new ListNode(data, name);
        if(head==null){
            head=temp;
            return head;
        }
        else{
            ListNode cn=head;
            while(cn.nextRef!=null){
                cn=cn.nextRef;
            }

            cn.nextRef=temp;
        }
        return head;

    }
    static void printList(ListNode head){

        while(head!=null){
            System.out.print(head.data+" => ");
            head=head.nextRef;
        }
    }
    static ListNode insertBeg(ListNode head, int data, String name){
        ListNode temp=new ListNode(data, name);

        temp.nextRef=head;
        head=temp;
        return head;
    }
    static void insertInMiddle(ListNode head, int data, String name){
     
    ListNode temp=new ListNode(data, name);
    ListNode slow=head;
    ListNode fast=head;
    while( fast.nextRef!=null && fast.nextRef.nextRef!=null){
        fast=fast.nextRef.nextRef;
        slow=slow.nextRef;
    }

    temp.nextRef=slow.nextRef;
    slow.nextRef=temp;

    }
    static void insertAtkth(ListNode head, int k,int data, String name){

        ListNode temp=new ListNode(data, name);

        k--;
        while(k>1){
            head=head.nextRef;
            k--;
        }

        temp.nextRef=head.nextRef;
        head.nextRef=temp;

    }
    static int insertbackAtkRec(ListNode head, int k , int data, String name){

        if(head==null){
            k--;
            return k;
        }
        k=insertbackAtkRec(head.nextRef, k, data, name);
        if(k==0){
            ListNode temp=new ListNode(data, name);
            temp.nextRef=head.nextRef;
            head.nextRef=temp;
            
        }
        k--;
        return k;

    }

    static void kthelemInsert3(ListNode head, int k , int data, String name){

        ListNode temp=new ListNode(data, name);
        ListNode first=head;

        while(k>1){
            k--;
            first=first.nextRef;
        }

        ListNode second=head;
        while(first.nextRef!=null){
            first=first.nextRef;
            second=second.nextRef;
        }

        temp.nextRef=second.nextRef;
        second.nextRef=temp;

    }

    static void insertAtKthfromback(ListNode head, int k , int data, String name){
        int length=lengthOfLinkedList(head);

        k=length-k+2;
        insertAtkth(head,k,data,name);

    }
    static int lengthOfLinkedList(ListNode head){
        int i=0;
        while(head!=null){
            i++;
            head=head.nextRef;
        }
        return i;
    }
    static ListNode remove(ListNode head,int k){
       
        ListNode first=head;
        if(k==1){
            head=head.nextRef;
            first.nextRef=null;
            first=null;
        }
        else{
            ListNode second=null;
            while(k>1){
                second=first;
                first=first.nextRef;
                k--;
            }

            second.nextRef=first.nextRef;
            first.nextRef=null;
           // first=null;
        }
        return head;
    }
   static  ListNode reverse(ListNode temp,ListNode head){
        
        if(head==null){
            return temp;
        }
        ListNode head2=head.nextRef;
        head.nextRef=temp;
        return reverse(head, head2);
    }
    public ListNode reverseList(ListNode head) {
     
        return reverse(null, head);
    }
    static public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null && fast.nextRef!=null){
        
            fast=fast.nextRef.nextRef;
            slow=slow.nextRef;
            if(fast==slow){
                return true;
            }
        }
        
        return false;
        
        
    }
    public static void main(String[] args) {
        ListNode head=null;

        head=insertIntoList(head,20,"abc");
        insertIntoList(head,30,"bcd");
        insertIntoList(head,40,"kldfg");
        insertIntoList(head,50,"bcdkljg");
        insertIntoList(head,60,"bcd");
        insertIntoList(head,70,"bcd");
        insertIntoList(head,80,"bcd");
        head=insertBeg(head,10,";lhl");

        insertInMiddle(head,45,"ifdi");
        insertAtkth(head,3,25,"djkfh" );
        insertAtKthfromback(head , 3, 65 , "sjgfaj");
        insertbackAtkRec(head,2,75,"s;jfdl");
        kthelemInsert3(head,4,72,"s;jfdl");
        remove(head,3);
        //int length=lengthOfLinkedList(head);
        printList(head);
    }
}
