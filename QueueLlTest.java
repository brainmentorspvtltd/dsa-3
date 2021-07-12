
class lNode{
    int data;
    lNode next;


    lNode(int data){
        this.data=data;
    }
}

class QueueLL{
    lNode rear;
    lNode front;
    int size;

    QueueLL(){
        rear=null;
        front=null;;
        size=0;
    }

    void enqueue(int data){
        lNode temp=new lNode(data);
        if(rear==null){
            rear=temp;
            front=rear;
            size++;
        }        
        else{

            rear.next=temp;
            rear=rear.next;
            size++;
        }
    }
    int dequeue(){
        if(front==null){
            new Exception("queue empty");
        }
        lNode temp=front;
        int data=temp.data;
        front=front.next;
        temp.next=null;
        size--;
        return data;
    }
    int rear(){
        if(rear==null){
            new Exception("empty queue");
        }
        return rear.data;
    }
    int front(){
        if(front==null){
            new Exception("empty queue");
        }
        return front.data;
    }
    boolean isEmpty(){
        if(rear==null){
            return true;
        }
        else{
            return false;
        }
    }
    int size(){
        return size;
    }
}

class QueueLlTest{

    public static void main(String[] args) {
        QueueLL q=new QueueLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println(q.front()+"   "+q.rear()+"   "+q.isEmpty());
    }
}












