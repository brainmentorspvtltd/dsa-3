package recursion.dynamicprogramming;

public class Fibonacci {

    static int fibo(int n,int arr[]){

        if(n==0 ||n==1){
            return arr[n];
        }
        else if(arr[n]!=0){
            return arr[n];
        }
        else{
            arr[n]=fibo(n-1,arr)+fibo(n-2,arr);
            return arr[n];
        }
    }

    static int fibo2(int n,int arr[]){
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args) {
        int n=7;
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        System.out.println( fibo2(n,arr) );
    }
}
