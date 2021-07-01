class Node{
    int data;
    String name;


    Node nextRef;

    Node(int data, String name){
        this.data=data;
        this.name=name;
        nextRef=null;
    }
}

class LinkedList{

    static void printRec(Node head){

        if(head==null){
            return ;
        }
        System.out.print(head.data+" => ");
        printRec(head.nextRef);
    }
    static void printList(Node head){

        while(head!=null){
            System.out.print(head.data+" => ");
            head=head.nextRef;
        }
    }
    
    public static void main(String[] args) {
        




        // Node head=new Node(10,"abc");
        // Node second=new Node(20,"bcd");
        // Node third=new Node(30,"efg");
        // Node fourth=new Node(40,"hig");
        // Node fifth=new Node(50,"lkm");


        // head.nextRef=second;
        // second.nextRef=third;
        // third.nextRef=fourth;
        // fourth.nextRef=fifth;

        // second=null;
        // third=null;
        // fourth=null;
        // fifth=null;

        // System.out.println(head.data+" -> "+head.nextRef.data
        // +" -> "+head.nextRef.nextRef.data+" -> "+head.nextRef.nextRef.nextRef.data+
        // " -> "+head.nextRef.nextRef.nextRef.nextRef.data);


        // printRec(head);
       // printList(head);

    }
}












