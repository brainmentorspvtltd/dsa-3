public class Arraysum {
    static int sum(int arr[],int i){


        if(i==arr.length){
            return 0;
        }
       //head rec
        return arr[i]+sum(arr,i+1);
    
    }

    static int sum(int arr[],int i,int sum){

        if(i==arr.length)
        return sum;
//tail
        sum=sum+arr[i];
        return sum(arr,i+1,sum);
    }
   public static void main(String[] args) {
       int arr[]={1,2,3,3,4,4,5,7,3};

       System.out.println(sum(arr, 0) );
       System.out.println(sum2(arr, 0,0) );
   } 
}
