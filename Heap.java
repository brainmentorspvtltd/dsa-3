public class Heap {
    int arr[];
    int curr;
    Heap(int k){
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
            if(arr[pindex]<arr[i]){
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
    int max(){
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
        int maxi=index;
        
        if(lefti<=curr && arr[maxi]<arr[lefti]){
            maxi=lefti;
        }
        if(righti<=curr &&arr[maxi]<arr[righti]){
            maxi=righti;
        }

        if(maxi!=index){
            int temp=arr[maxi];
            arr[maxi]=arr[index];
            arr[index]=temp;
            heapify(maxi);
        }

    }
    void deleteatK(int index){

        arr[index]=Integer.MAX_VALUE;
        for(int i=index;i>0;){
            int pi=(i-1)/2;
            if(arr[pi]<arr[i]){
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
            if(arr[pi]<arr[i]){
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
        Heap h=new Heap(10);
        h.insert(20);
        h.insert(40);
        h.insert(10);
        h.insert(6);
        h.insert(80);
        h.insert(8);
        h.insert(23);
    
        //System.out.println(h.max());
        System.out.println();
        for(int i=0;i<=h.curr;i++){
            System.out.print(h.arr[i]+" ");
        }

        h.delete();
        // System.out.println(h.max());
        System.out.println();
        for(int i=0;i<=h.curr;i++){
            System.out.print(h.arr[i]+" ");
        }
        h.deleteatK(2);
        System.out.println(h.max());
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
