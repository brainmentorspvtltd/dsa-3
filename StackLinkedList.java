class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}
class Stack{
    Node head;
    int size=0;
    void push(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            size++;
        }
        else{
            temp.next=head;
            head=temp;
            size++;
        }
    }
    void pop() throws Exception{
        if(head==null){
           throw new Exception("Stack Underflow");
        }
        Node temp=head.next;
        head.next=null;
        head=temp;
        size--;
    }

    int peek()throws Exception{
        if(head==null){
            throw new Exception("Stack Underflow");
         }
        return head.data;
    }

    boolean empty(){
        return head==null?true:false;
    }
    int size(){
        return size;
    }
}
public class StackLinkedList {
public static void main(String[] args)  throws Exception{
    Stack st=new Stack();
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    st.pop();
    st.pop();
    st.pop();
    System.out.println(st.peek());

}    
}
