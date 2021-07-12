

class QueueA{
    private int arr[];

    private int rear;
    private int front;
    QueueA(int k){
        arr=new int[k];
        rear=-1;
        front=-1;
    }

    void shift(){
        for(int i=front,j=0;i<=arr.length-1;i++,j++){
            arr[j]=arr[i];
        }
        rear=rear-front;
        front=0;
    }
    void enqueue(int data){

        
        if(rear==arr.length){
            new Exception("queue overflow");
        }
        
        rear=rear+1;
        arr[rear]=data;

        if(rear==arr.length){
            if(front==0){

            }
            else{
                shift();
            }
        }
        if(rear==0){
            front=0;
        }
    }
    int dequeue(){

        if(front==-1){
            new Exception("empty queue");
        }
        
        front=front+1;
        int data=arr[front-1];
        if(front>rear){
            front=-1;
            rear=-1;
        }
    
        return data;

    }
    int front(){
        if(front==-1){
            new Exception("empty queue");
        }
        return arr[front];
    }

    int rear(){
        if(rear==-1){
            new Exception("empty queue");
        }
        return arr[rear];
    }
    int size(){
        if(rear==-1 && front==-1){
            return 0;
        }
        else{
            return rear-front+1;
        }
    }
    boolean isEmpty(){
        if(rear==front && front==-1){
            return true;
        }
        return false;
    }
}

//enqueue(), dequeue(), size(), isEmpty(), front(), rear()
class QueueArrTest{
    public static void main(String[] args) {
        QueueA obj=new QueueA(5);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.dequeue();
        obj.dequeue();
        
        System.out.println(obj.front()+"   "+obj.rear());
    }
}





