public class MinHeap {
    int arr[];
    int curr;
    MinHeap(int k){
        arr=new int[k];
        curr=-1;
    }

    void insert(int data){

        curr++;
        if(curr==arr.length){
            new Exception("overflow");
        }
        arr[curr]=data;
        if(curr==0){
            return;
        }
        for(int i=curr;i>0;){
            int pindex=(i-1)/2;
            if(arr[pindex]>arr[i]){
                int temp=arr[i];
                arr[i]=arr[pindex];
                arr[pindex]=temp;

                i=pindex;
            }
            else{
                break;
            }
        }

    }
    int min(){
        if(curr==-1){
            new Exception("underflow");

        }
        
            return arr[0];
        
    }
    void delete(){
        arr[0]=arr[curr];
        curr--;
        heapify(0);
    }

    void heapify(int index){
        int lefti=index*2+1;
        int righti=index*2+2;
        int mini=index;
        
        if(lefti<=curr && arr[mini]>arr[lefti]){
            mini=lefti;
        }
        if(righti<=curr &&arr[mini]>arr[righti]){
            mini=righti;
        }

        if(mini!=index){
            int temp=arr[mini];
            arr[mini]=arr[index];
            arr[index]=temp;
            heapify(mini);
        }

    }
    void deleteatK(int index){

        arr[index]=Integer.MIN_VALUE;
        for(int i=index;i>0;){
            int pi=(i-1)/2;
            if(arr[pi]>arr[i]){
                int temp=arr[pi];
                arr[pi]=arr[i];
                arr[i]=temp;
                i=pi;
            }
            else{
                break;
            }
        }

        arr[0]=arr[curr];
        curr--;
        heapify(0);

    }
    void change(int in, int newValue){
        arr[in]=newValue;
        int i=0;

        for(i=in;i>0;){
            int pi=(i-1)/2;
            if(arr[pi]>arr[i]){
                int temp=arr[pi];
                arr[pi]=arr[i];
                arr[i]=temp;
                i=pi;
            }
            else{
                break;
            }
        }

        heapify(i);
    }
    public static void main(String[] args) {
        MinHeap h=new MinHeap(10);
        h.insert(20);
        h.insert(40);
        h.insert(10);
        h.insert(6);
        h.insert(80);
        h.insert(8);
        h.insert(23);
    
        //System.out.println(h.min());
        System.out.println();
        for(int i=0;i<=h.curr;i++){
            System.out.print(h.arr[i]+" ");
        }

        h.delete();
        // System.out.println(h.min());
        System.out.println();
        for(int i=0;i<=h.curr;i++){
            System.out.print(h.arr[i]+" ");
        }
        h.deleteatK(2);
        System.out.println(h.min());
        for(int i=0;i<=h.curr;i++){
            System.out.print(h.arr[i]+" ");
        }

        h.change(1,1);
        System.out.println();
        for(int i=0;i<=h.curr;i++){
            System.out.print(h.arr[i]+" ");
        }
    }
}

